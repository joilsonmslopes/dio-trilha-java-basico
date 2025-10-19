package com.joilson.DigitalBank.interfaces;


import com.joilson.DigitalBank.models.Account;

import java.math.BigDecimal;

public interface IAccount {
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(Account toAccount, BigDecimal amount);
    void getStatement();
}
