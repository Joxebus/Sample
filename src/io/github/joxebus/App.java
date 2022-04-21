package io.github.joxebus;

import io.github.joxebus.dto.BankAccount;
import io.github.joxebus.dto.Client;
import io.github.joxebus.service.BankAccountService;
import io.github.joxebus.service.BankAccountServiceBanamex;
import io.github.joxebus.service.BankAccountServiceSantander;

public class App {

    public static void main(String[] args) {
        BankAccount bankAccountSantander = new BankAccount();
        BankAccount bankAccountBanamex = new BankAccount();
        BankAccountService santader = new BankAccountServiceSantander();
        BankAccountService banamex = new BankAccountServiceBanamex();

        bankAccountSantander.setBankAccountNumber("001");
        bankAccountSantander.setBalance(100.0);

        bankAccountBanamex.setBankAccountNumber("001");
        bankAccountBanamex.setBalance(100.0);

        // Start operations with santander
        santader.deposit(bankAccountSantander, 200.0);
        santader.balance(bankAccountSantander);
        System.out.println("Quantity withdraw: "+santader.withdraw(bankAccountSantander, 50.0));
        santader.balance(bankAccountSantander);

        System.out.println("---------------");

        // Start operations with santander
        banamex.deposit(bankAccountBanamex, 200.0);
        banamex.balance(bankAccountBanamex);
        System.out.println("Quantity withdraw: "+banamex.withdraw(bankAccountBanamex, 50.0));
        banamex.balance(bankAccountBanamex);
    }
}
