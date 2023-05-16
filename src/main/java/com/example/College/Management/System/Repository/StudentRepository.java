package com.example.College.Management.System.Repository;

import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
