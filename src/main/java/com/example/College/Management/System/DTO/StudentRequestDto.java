package com.example.College.Management.System.DTO;

import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Enum.BranchName;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentRequestDto {

    private String name;

    private int rollNo;

    private BranchName branchName;

    private int marks;
}
