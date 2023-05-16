package com.example.College.Management.System.Repository;

import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Entity.Student;
import com.example.College.Management.System.Enum.BranchName;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer>{
      Branch findByBranchName(BranchName branchName);

    }
