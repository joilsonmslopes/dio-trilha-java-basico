package com.joilson.DigitalBank.models;
import com.joilson.DigitalBank.interfaces.IAccount;
import lombok.Getter;

@Getter
public abstract class Account implements IAccount {
    private static int SEQUENTIAL = 1;
    private final static int AGENCY_NUMBER = 1;

    private final Client client;
    private final int accountNumber;
    private final int agencyNumber;
    private final double balance;

    public Account(Client client) {
        this.client = client;
        this.accountNumber = SEQUENTIAL++;
        this.agencyNumber = AGENCY_NUMBER;
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void transfer(Account toAccount, double amount) {

    }

    @Override
    public String getStatement() {
        return "";
    }
}
