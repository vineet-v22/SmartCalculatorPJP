package com.savoira.pjp.week4.Assignment1;

public class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;
    private int transactionCount;

    // Primary constructor
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

    // No-argument constructor
    public BankAccount() {
        this("ACC000", "Unknown", 0.0);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit: amount must be greater than 0.");
            return;
        }

        balance += amount;
        transactionCount++;

        System.out.println("Deposited Rs." + amount + " to " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal: amount must be greater than 0.");
            return;
        }

        if (amount > balance) {
            System.out.println("Invalid withdrawal: insufficient balance.");
            return;
        }

        balance -= amount;
        transactionCount++;

        System.out.println("Withdrawn Rs." + amount + " from " + accountNumber);
    }

    @Override
    public String toString() {
        return accountNumber + " | "
                + holderName + " | Balance: Rs."
                + balance + " | Txn: "
                + transactionCount;
    }
}