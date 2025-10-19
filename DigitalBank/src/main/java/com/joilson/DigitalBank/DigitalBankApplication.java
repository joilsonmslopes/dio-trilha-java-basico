package com.joilson.DigitalBank;

import com.joilson.DigitalBank.models.Bank;
import com.joilson.DigitalBank.models.CheckingAccount;
import com.joilson.DigitalBank.models.Client;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class DigitalBankApplication {

	public static void main(String[] args) {
        try {
            Bank bank = new Bank();

            CheckingAccount checkingAccount1 = bank.createCheckingAccount(new CheckingAccount(new Client("Carlos Henrique", LocalDateTime.of(1995, 3, 25, 5, 0, 0))));
            CheckingAccount checkingAccount2 = bank.createCheckingAccount(new CheckingAccount(new Client("José Eduardo", LocalDateTime.of(1987, 5, 25, 5, 0, 0))));

            checkingAccount1.deposit(500);
            checkingAccount2.deposit(500);
            checkingAccount2.transfer(checkingAccount1, 150);
            checkingAccount2.deposit(50);
            checkingAccount2.withdraw(25);
            checkingAccount1.transfer(checkingAccount2, 90);

            checkingAccount1.getStatement();
            checkingAccount2.getStatement();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de transação: " + e.getMessage());
        }
	}

}
