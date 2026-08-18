package com.savoira.pjp.week4.Assignment2;

public class BankAccount {

    private static int totalAccounts = 0;

    private final String accountNumber;
    private String holderName;
    private double balance;
    private int transactionCount;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionCount = 0;

        totalAccounts++;
    }

    public BankAccount() {
        this("ACC000", "Unknown", 0.0);
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit: amount must be greater than 0.");
            return;
        }

        if (amount > BankConfig.MAX_DEPOSIT) {
            System.out.println("Invalid deposit: amount exceeds maximum deposit limit.");
            return;
        }

        if (transactionCount >= BankConfig.MAX_DAILY_TXN) {
            System.out.println("Invalid deposit: daily transaction limit reached.");
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

        if (amount > BankConfig.MAX_WITHDRAWAL) {
            System.out.println("Invalid withdrawal: amount exceeds maximum withdrawal limit.");
            return;
        }

        if (amount > balance) {
            System.out.println("Invalid withdrawal: insufficient balance.");
            return;
        }

        if (transactionCount >= BankConfig.MAX_DAILY_TXN) {
            System.out.println("Invalid withdrawal: daily transaction limit reached.");
            return;
        }

        balance -= amount;
        transactionCount++;

        System.out.println("Withdrawn Rs." + amount + " from " + accountNumber);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public String toString() {
        return accountNumber + " | "
                + holderName + " | Balance: Rs."
                + balance + " | Txn: "
                + transactionCount;
    }
}
