package com.savoira.pjp.week4.Assignment1;

public class Demo {

    public static void main(String[] args) {

        // Create two bank accounts
        BankAccount account1 =
                new BankAccount("ACC101", "Vineet", 10000);

        BankAccount account2 =
                new BankAccount("ACC102", "Rahul", 5000);

        // Account 1 - valid operations
        account1.deposit(2000);
        account1.withdraw(1000);

        // Account 1 - invalid operation
        account1.withdraw(15000);

        // Account 2 - valid operations
        account2.deposit(1000);
        account2.withdraw(500);

        // Account 2 - invalid operation
        account2.deposit(-500);

        // Print final account details
        System.out.println();
        System.out.println(account1);
        System.out.println(account2);
    }
}