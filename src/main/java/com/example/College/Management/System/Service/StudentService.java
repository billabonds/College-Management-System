package com.example.College.Management.System.Service;

import com.example.College.Management.System.DTO.StudentRequestDto;
import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Entity.Student;
import com.example.College.Management.System.Repository.BranchRepository;
import com.example.College.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    BranchRepository branchRepository;


    // ----------------------------------------------------------------------------------------


    // Student - name, rollNo, branchName, Marks.
    public String addStudent(StudentRequestDto studentRequestDto) {

        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setRollNo(studentRequestDto.getRollNo());
        student.setBranchName(studentRequestDto.getBranchName());
        student.setMarks(studentRequestDto.getMarks());

        Branch branch = branchRepository.findByBranchName(studentRequestDto.getBranchName());

        student.setBranch(branch);
        branch.getStudentList().add(student);

        studentRepository.save(student);
        return "Student Added Successfully";
   }

}
