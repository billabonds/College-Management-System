package com.example.College.Management.System.Service;

import com.example.College.Management.System.DTO.BranchRequestDto;
import com.example.College.Management.System.DTO.GrantRequestDto;
import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Entity.Granted;
import com.example.College.Management.System.Entity.Student;
import com.example.College.Management.System.Repository.BranchRepository;
import com.example.College.Management.System.Repository.GrantRepository;
import com.example.College.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class BranchService {

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    GrantRepository grantRepository;

    HashMap<Branch,Integer> branchIntegerDb = new HashMap<>();        // key :branch , value : no. of passed student

    int max = 0;

    // --------------------------------------------------------------------------------------------------

    public String addBranch(BranchRequestDto branchRequestDto) {

        Branch branch = new Branch();

        branch.setBranchName(branchRequestDto.getBranchName());
        branch.setHodName(branchRequestDto.getHodName());
        branch.setContactNo(branchRequestDto.getContactNo());
        branch.setYear(branchRequestDto.getYear());

        branch.setGrantedRupees(branchRequestDto.getGrantRupees());

        branchRepository.save(branch);

        return "Branch added Successfully";
    }


    public List<String> listOfContactNoOfHod() {

        List<String> mobileNumberList = new ArrayList<>();

        List<Branch> branchList = branchRepository.findAll();

        for(Branch st : branchList){

            List<Student> studentList = st.getStudentList();
            int count = 0;

            for(Student s : studentList)
            {
                if(s.getMarks() >= 40)
                    count++;
            }
            if(max < count)
                max  = count;

            branchIntegerDb.put(st,count);
        }

        for(Branch st : branchIntegerDb.keySet()){
            if(branchIntegerDb.containsKey(st))
            {
                if(max == branchIntegerDb.get(st))
                    mobileNumberList.add(st.getContactNo());
            }
        }

        return mobileNumberList;
    }


    // GET API - Find the list of roll no. of students which belongs to the most recent branch of college in terms of year only.
    public List<Integer> listOfRollNo(){

        List<Integer> ans = new ArrayList<>();
        int recent = 0;

        for(Branch b : branchRepository.findAll())
        {
            if(recent < b.getYear()) {
                recent = b.getYear();
            }
        }

        for(Branch b : branchRepository.findAll())
        {
            if(recent == b.getYear())
            {
                for(Student st : b.getStudentList())
                    ans.add(st.getRollNo());
            }
        }

        return ans;
    }



    // GET API - Find the grant given to the department containing the maximum absolute number of students who have passed.
    public int findGrantMaximum(@RequestBody GrantRequestDto grantRequestDto){

        for(Branch b : branchIntegerDb.keySet())
        {
            if(max == branchIntegerDb.get(b))
                return b.getGrantedRupees();
        }

        return -1;
    }


}
