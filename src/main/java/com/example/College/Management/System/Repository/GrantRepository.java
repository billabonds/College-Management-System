package com.example.College.Management.System.Repository;

import com.example.College.Management.System.Entity.Granted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrantRepository extends JpaRepository<Granted,Integer> {

}
