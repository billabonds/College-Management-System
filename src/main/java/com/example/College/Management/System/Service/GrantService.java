package com.example.College.Management.System.Service;

import com.example.College.Management.System.DTO.GrantRequestDto;
import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Repository.BranchRepository;
import com.example.College.Management.System.Repository.GrantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrantService {

    @Autowired
    GrantRepository grantRepository;

    @Autowired
    BranchRepository branchRepository;

}
