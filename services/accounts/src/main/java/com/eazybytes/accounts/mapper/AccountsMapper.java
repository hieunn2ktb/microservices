package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entity.Accounts;

public class AccountsMapper {
    public static AccountsDto toAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountsNumber(accounts.getAccountsNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }
    public static Accounts toAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountsNumber(accountsDto.getAccountsNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
