package com.example.College.Management.System.Controller;

import com.example.College.Management.System.DTO.StudentRequestDto;
import com.example.College.Management.System.Entity.Student;
import com.example.College.Management.System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;



    // -------------------------------------------------------------------------------------

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){

        return studentService.addStudent(studentRequestDto);
    }

}
