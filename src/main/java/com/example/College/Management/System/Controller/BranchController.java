package com.example.College.Management.System.Controller;

import com.example.College.Management.System.DTO.BranchRequestDto;
import com.example.College.Management.System.DTO.GrantRequestDto;
import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Entity.Student;
import com.example.College.Management.System.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("branch")
public class BranchController {

    @Autowired
    BranchService branchService;



    // ----------------------------------------------------------------------------------------

    @PostMapping("/add")
    public String addBranch(@RequestBody BranchRequestDto branchRequestDto){

        return branchService.addBranch(branchRequestDto);

    }


    @GetMapping("/listOfHod")
    public List<String> listOfContactNoOfHod(){

        return branchService.listOfContactNoOfHod();
    }


    @GetMapping("/listOfRollNo")
    public List<Integer> listOfRollNo(){

        return branchService.listOfRollNo();
    }


    @GetMapping("/findGrantMaximum")
    public int findGrantMaximum(@RequestBody GrantRequestDto grantRequestDto){

        return branchService.findGrantMaximum(grantRequestDto);
    }
}
