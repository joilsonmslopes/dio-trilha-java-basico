package com.joilson.DigitalBank;

import com.joilson.DigitalBank.models.Account;
import com.joilson.DigitalBank.models.Bank;
import com.joilson.DigitalBank.models.CheckingAccount;
import com.joilson.DigitalBank.models.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class DigitalBankApplication {

	public static void main(String[] args) {
        Bank bank = new Bank();
        Account cc = new CheckingAccount(new Client("Joilson", LocalDateTime.of(2000, 1, 1, 1, 0, 0)));
        System.out.println(cc.getBalance());
	}

}
