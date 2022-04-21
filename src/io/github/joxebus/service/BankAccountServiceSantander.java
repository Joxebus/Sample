package io.github.joxebus.service;

import io.github.joxebus.dto.BankAccount;

public class BankAccountServiceSantander implements BankAccountService {

    @Override
    public void deposit(BankAccount bankAccount, double amount) {
        // Step 1 - Extract the current balance
        double balance = bankAccount.getBalance();
        // Step 2 - Plus balance and amount
        double newBalance = balance + amount;
        // Step 3 - Set the newBalance to the account
        bankAccount.setBalance(newBalance);
    }

    @Override
    public double withdraw(BankAccount bankAccount, double amount) {
        // Step 1 - Extract the current balance
        double balance = bankAccount.getBalance();
        // Step 2 - Subtract amount from balance
        double newBalance = balance - amount;
        // Step 3 - Set the newBalance to the account
        bankAccount.setBalance(newBalance);
        // Step 4 - Return the amount required
        return amount;
    }

    @Override
    public void balance(BankAccount bankAccount) {
        System.out.println("The balance is: "+bankAccount.getBalance());
    }
}
