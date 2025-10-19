package com.joilson.DigitalBank.models;
import com.joilson.DigitalBank.interfaces.IAccount;
import com.joilson.DigitalBank.interfaces.MovementType;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public abstract class Account implements IAccount {
    private static int SEQUENTIAL = 1;
    private final static int AGENCY_NUMBER = 1;

    private final Client client;
    private final int accountNumber;
    private final int agencyNumber;
    private double balance;
    private final List<Movement> movements;

    public Account(Client client) {
        this.client = client;
        this.accountNumber = SEQUENTIAL++;
        this.agencyNumber = AGENCY_NUMBER;
        this.balance = 0;
        this.movements = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Não pode depositar um valor negativo.");
        }

        this.balance += amount;
        movements.add(new Movement(MovementType.DEPOSIT, amount, null));
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Não pode sacar um valor negativo.");
        }

        if (this.balance - amount < 0) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        this.balance -= amount;
        movements.add(new Movement(MovementType.WITHDRAW, amount, null));
    }

    @Override
    public void transfer(Account toAccount, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Não pode transferir um valor negativo.");
        }

        this.withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public void getStatement() {
        System.out.println("============== Extrato ==============");
        System.out.println("Conta: " + this.accountNumber);
        System.out.println("Agência: " + this.agencyNumber);
        System.out.println("============ Transações ============");
        movements.forEach(movement -> {
            System.out.print("Tipo de Transação: " + movement.getMovementType().getLabel());
            System.out.println(". Valor: " + movement.getAmount());
        });
        System.out.println("====================================");
        System.out.println("Saldo Atualizado: " + this.balance);
    }
}
