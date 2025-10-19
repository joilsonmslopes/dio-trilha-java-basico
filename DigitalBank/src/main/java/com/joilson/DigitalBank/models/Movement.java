package com.joilson.DigitalBank.models;

import com.joilson.DigitalBank.interfaces.MovementType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movement {
    private MovementType movementType;
    private double amount;
    private Account toAccount;
}
