package com.savoira.pjp.biweekly2;

public class StringBuilderDemo {

    public static String buildReport(String[] items) {

        StringBuilder report = new StringBuilder("Report: ");

        for (int i = 0; i < items.length; i++) {
            report.append(items[i]);

            if (i < items.length - 1) {
                report.append(" | ");
            }
        }

        return report.toString();
    }

    public static void main(String[] args) {

        String[] transactions = {
                "Deposit Rs.5000",
                "ATM Withdrawal Rs.1000",
                "UPI Payment Rs.750",
                "Salary Credit Rs.50000",
                "Electricity Bill Rs.1200"
        };

        System.out.println(buildReport(transactions));
    }

    /*
     * StringBuilder is preferred over String concatenation inside a loop
     * because String objects are immutable. Repeated concatenation creates
     * many new String objects, while StringBuilder modifies the same object.
     */
}
