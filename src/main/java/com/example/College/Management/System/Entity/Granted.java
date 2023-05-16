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
@Table(name = "granted")
public class Granted {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int grantId;

    @Enumerated(EnumType.STRING)
    private BranchName branchName;

    private int grantRupees;

//    @OneToOne
//    @JoinColumn
//    Branch branch;
}
