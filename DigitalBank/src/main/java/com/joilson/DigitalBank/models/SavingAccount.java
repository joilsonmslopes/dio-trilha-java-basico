package com.joilson.DigitalBank.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingAccount extends Account{
    public SavingAccount(Client client) {
        super(client);
    }
}
