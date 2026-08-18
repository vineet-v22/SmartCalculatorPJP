package com.savoira.pjp.week4.Assignment2;

public class Demo {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("ACC101", "Vineet", 10000);

        BankAccount account2 =
                new BankAccount("ACC102", "Rahul", 5000);

        System.out.println("Initial accounts:");
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("\nAccount 1 operations:");
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.withdraw(15000);

        System.out.println("\nAccount 2 operations:");
        account2.deposit(1000);
        account2.withdraw(500);
        account2.deposit(-500);

        System.out.println("\nFinal account details:");
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("\nTotal accounts created: "
                + BankAccount.getTotalAccounts());

        LoanUtils loanUtils = new LoanUtils();

        var finalAmount = loanUtils.calculateLoanAmount(
                100000,
                12,
                12
        );

        System.out.printf(
                "Loan amount after 12 months: Rs.%.2f%n",
                finalAmount
        );
    }
}