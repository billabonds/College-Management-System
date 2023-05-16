package com.example.College.Management.System.DTO;

import com.example.College.Management.System.Entity.Branch;
import com.example.College.Management.System.Enum.BranchName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GrantRequestDto {

    private BranchName branchName;

    private int grantRupees;

    Branch branch;
}
