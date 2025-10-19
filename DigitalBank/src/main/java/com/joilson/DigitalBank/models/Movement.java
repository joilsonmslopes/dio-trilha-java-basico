package com.joilson.DigitalBank.models;

import com.joilson.DigitalBank.interfaces.MovementType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Movement {
    private MovementType movementType;
    private BigDecimal amount;
    private Account toAccount;
}
