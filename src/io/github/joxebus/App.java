package io.github.joxebus;

import io.github.joxebus.dto.BankAccount;
import io.github.joxebus.dto.Client;

public class App {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Client client = new Client();

        bankAccount.bankAccountNumber = "001";
        bankAccount.balance = 100.0;

        client.bankAccount = bankAccount;
        client.clientNumber = "0001";



    }
}
