package com.example.College.Management.System.Entity;

import com.example.College.Management.System.Enum.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {

    // Student - name, rollNo, branchName, Marks.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String name;

    private int rollNo;

    @Enumerated(EnumType.STRING)
    private BranchName branchName;

    private int marks;

    @ManyToOne
    @JoinColumn
    Branch branch;
}
