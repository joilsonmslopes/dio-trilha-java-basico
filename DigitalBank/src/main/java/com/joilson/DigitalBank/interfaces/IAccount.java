package com.joilson.DigitalBank.interfaces;


import com.joilson.DigitalBank.models.Account;

public interface IAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(Account toAccount, double amount);
    void getStatement();
}
