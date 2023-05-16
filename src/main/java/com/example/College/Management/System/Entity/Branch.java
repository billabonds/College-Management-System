package com.example.College.Management.System.Entity;

import com.example.College.Management.System.Enum.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branchId;

    @Enumerated(EnumType.STRING)
    private BranchName branchName;

    private String hodName;

    private String contactNo;

    private int year;

    @OneToMany(mappedBy = "branch",cascade = CascadeType.ALL)
    List<Student> studentList = new ArrayList<>();

    int grantedRupees;
}


// Question :

// Create an API for managing the results of college students where every student has name, unique roll no,
// branch - CSE,IT,EE,ME,BT and marks out of 100 and passing criteria is >=40 marks.
// (Ask the student to create an Enum for branch Name) and grant given to every branch of the college which
// can vary form branch to branch in a college.

// Student - name, rollNo, branchName, Marks.
// Branch  - branchName, HodName, ContactNo. , // year
// Grant   - branchName, grant given in rupees.

// POST    - Add a student with given name, roll no, branchName, marks.
// GET API - Find list of contact number of HOD(s) who has maximum no. of passing students in their branch.
// GET API - Find the list of roll no. of students which belongs to the most recent branch of college in terms of year only.
// GET API - Find the grant given to the department containing the maximum absolute number of students who have passed.
