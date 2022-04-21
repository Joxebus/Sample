package io.github.joxebus.service;

import io.github.joxebus.dto.BankAccount;

public interface BankAccountService {

    void deposit(BankAccount bankAccount, double amount);

    double withdraw(BankAccount bankAccount, double amount);

    void balance(BankAccount bankAccount);
}
