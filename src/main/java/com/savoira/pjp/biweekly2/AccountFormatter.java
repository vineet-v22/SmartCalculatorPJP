package com.savoira.pjp.biweekly2;

import java.util.Locale;

public class AccountFormatter {

    public static String formatAccountSummary(
            String name,
            double balance,
            String accountType) {

        String formattedName = name.toUpperCase(Locale.ROOT);

        return String.format(
                Locale.ROOT,
                "Account Holder: %s | Type: %s | Balance: ₹%.2f",
                formattedName,
                accountType,
                balance
        );
    }

    public static void main(String[] args) {

        System.out.println(
                formatAccountSummary(
                        "Priya Sharma",
                        45200.50,
                        "SAVINGS"
                )
        );

        System.out.println(
                formatAccountSummary(
                        "Rahul Verma",
                        12500.75,
                        "CURRENT"
                )
        );

        System.out.println(
                formatAccountSummary(
                        "Aman Singh",
                        78000.00,
                        "SALARY"
                )
        );
    }
}
