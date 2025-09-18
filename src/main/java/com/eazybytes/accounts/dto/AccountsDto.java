package com.eazybytes.accounts.dto;

import com.eazybytes.accounts.entity.Accounts;
import lombok.Data;
import lombok.Getter;

@Data
public class AccountsDto {
    private Long accountsNumber;

    private String accountType;

    private String branchAddress;

}
