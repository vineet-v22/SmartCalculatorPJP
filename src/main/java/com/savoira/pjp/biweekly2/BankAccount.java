package com.savoira.pjp.biweekly2;

public class BankAccount {

    private final String accountNumber;
    private final String holderName;
    private double balance;
    private int transactionCount;

    /**
     * Creates a bank account with the given initial balance.
     *
     * @param accountNumber unique account number
     * @param holderName name of the account holder
     * @param initialBalance starting balance
     */
    public BankAccount(
            String accountNumber,
            String holderName,
            double initialBalance) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Account number cannot be empty."
            );
        }

        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException(
                    "Holder name cannot be empty."
            );
        }

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative."
            );
        }

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

    /**
     * Creates a bank account with zero initial balance.
     *
     * @param accountNumber unique account number
     * @param holderName name of the account holder
     */
    public BankAccount(
            String accountNumber,
            String holderName) {

        this(accountNumber, holderName, 0.0);
    }

    /**
     * Deposits money into the account.
     *
     * @param amount amount to deposit
     */
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Invalid deposit: amount must be greater than 0."
            );
            return;
        }

        balance += amount;
        transactionCount++;

        System.out.printf(
                "Deposited Rs.%.2f%n",
                amount
        );
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount amount to withdraw
     */
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Invalid withdrawal: amount must be greater than 0."
            );
            return;
        }

        if (amount > balance) {
            System.out.println(
                    "Invalid withdrawal: insufficient balance."
            );
            return;
        }

        balance -= amount;
        transactionCount++;

        System.out.printf(
                "Withdrawn Rs.%.2f%n",
                amount
        );
    }

    /**
     * Returns the current account balance.
     *
     * @return current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the number of successful transactions.
     *
     * @return transaction count
     */
    public int getTransactionCount() {
        return transactionCount;
    }

    /**
     * Returns a formatted summary of the account.
     *
     * @return account summary
     */
    public String getSummary() {

        return String.format(
                "Account: %s | Holder: %s | Balance: Rs.%.2f | Transactions: %d",
                accountNumber,
                holderName,
                balance,
                transactionCount
        );
    }

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(
                        "ACC101",
                        "Vineet Verma",
                        10000
                );

        BankAccount account2 =
                new BankAccount(
                        "ACC102",
                        "Rahul Sharma"
                );

        account1.deposit(5000);
        account1.withdraw(2000);

        account2.deposit(3000);
        account2.withdraw(1000);

        // Invalid operation
        account1.withdraw(-500);

        System.out.println();
        System.out.println(account1.getSummary());
        System.out.println(account2.getSummary());
    }
}
