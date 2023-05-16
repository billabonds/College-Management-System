package com.example.College.Management.System.Controller;

import com.example.College.Management.System.DTO.GrantRequestDto;
import com.example.College.Management.System.Service.GrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("grant")
public class GrantController {

    @Autowired
    GrantService grantService;

}
