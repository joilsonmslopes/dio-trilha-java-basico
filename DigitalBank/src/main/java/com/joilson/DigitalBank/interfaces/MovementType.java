package com.joilson.DigitalBank.interfaces;

import lombok.Getter;

@Getter
public enum MovementType {
    DEPOSIT("depósito"),
    WITHDRAW("saque");

    private final String label;

    MovementType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
