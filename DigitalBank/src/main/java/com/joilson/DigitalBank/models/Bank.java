package com.joilson.DigitalBank.models;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Bank {
    List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public CheckingAccount createCheckingAccount(CheckingAccount account) {
        accounts.add(new CheckingAccount(account.getClient()));

        return account;
    }

    public SavingAccount createSavingAccount(SavingAccount account) {
        accounts.add(new SavingAccount(account.getClient()));

        return account;
    }
}
