package com.joilson.DigitalBank.models;

import lombok.Data;

import java.util.List;

@Data
public class Bank {
    List<Account> accounts;
}
