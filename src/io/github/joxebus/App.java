package io.github.joxebus;

import io.github.joxebus.dto.BankAccount;
import io.github.joxebus.dto.Client;

public class App {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Client client = new Client();

        bankAccount.setBankAccountNumber("001");
        bankAccount.setBalance(100.0);

        client.setBankAccount(bankAccount);
        client.setClientNumber("0001");

        System.out.println("El cliente con el numero: " + client.getClientNumber());
        System.out.println("Tiene un balance de: " + client.getBankAccount().getBalance());
        System.out.println("En su cuenta numero: " + client.getBankAccount().getBankAccountNumber());

    }
}
