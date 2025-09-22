package com.eazybytes.accounts.dto;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;

@Data
public class AccountsDto {
    @NotEmpty(message = "accountsNumber can not be a null or empty")
    @Pattern(regexp = "($|[0-9]{10})", message = "accountsNumber must be 10 digis")
    private Long accountsNumber;

    @NotEmpty(message = "accountType can not be a null or empty")
    private String accountType;

    @NotEmpty(message = "branchAddress can not be a null or empty")
    private String branchAddress;

}
