package com.example.College.Management.System.DTO;

import com.example.College.Management.System.Enum.BranchName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BranchRequestDto {

    private BranchName branchName;

    private String hodName;

    private String contactNo;

    private int year;

    private int grantRupees;
}
