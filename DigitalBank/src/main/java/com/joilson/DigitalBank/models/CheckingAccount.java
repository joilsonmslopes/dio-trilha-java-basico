package com.joilson.DigitalBank.models;

import lombok.*;

@Getter
@Setter
public class CheckingAccount extends Account {
    public CheckingAccount(Client client) {
        super(client);
    }
}
