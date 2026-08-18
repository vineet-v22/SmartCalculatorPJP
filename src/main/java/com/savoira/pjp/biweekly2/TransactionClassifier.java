package com.savoira.pjp.biweekly2;

public class TransactionClassifier {

    public static String classifyTransaction(String type, double amount) {

        return switch (type) {

            case "CREDIT" ->
                    "Income — positive cash flow";

            case "DEBIT" ->
                    "Expense — deducted from balance";

            case "TRANSFER" ->
                    amount > 10000
                            ? "Large Transfer — requires OTP"
                            : "Standard Transfer";

            case "WITHDRAWAL" ->
                    "Cash Withdrawal";

            default ->
                    throw new IllegalArgumentException(
                            "Unknown transaction type: " + type
                    );
        };
    }

    public static void main(String[] args) {

        System.out.println(
                classifyTransaction("CREDIT", 5000)
        );

        System.out.println(
                classifyTransaction("DEBIT", 1500)
        );

        System.out.println(
                classifyTransaction("TRANSFER", 15000)
        );

        System.out.println(
                classifyTransaction("TRANSFER", 5000)
        );

        System.out.println(
                classifyTransaction("WITHDRAWAL", 2000)
        );

        try {
            System.out.println(
                    classifyTransaction("UNKNOWN", 1000)
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
