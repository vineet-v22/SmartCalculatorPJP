package com.savoira.pjp.week4.Assignment2;

/*
 * Five clean-code violations in the original method:
 *
 * 1. Poor method name: "calc" does not clearly explain what the method does.
 * 2. Poor variable names: "a", "b", "c", "r", and "i" are not descriptive.
 * 3. Magic number: 1200 is used directly without explaining its meaning.
 * 4. Poor formatting: the loop is written in a compressed and difficult-to-read way.
 * 5. Missing documentation: the method has no explanation of its purpose,
 *    parameters, or return value.
 */

public class LoanUtils {

    /**
     * Calculates the final loan amount using compound interest.
     *
     * @param principalAmount the initial loan amount
     * @param annualInterestRate the annual interest rate in percentage
     * @param numberOfMonths the number of months
     * @return the final loan amount after applying compound interest
     */
    public double calculateLoanAmount(
            double principalAmount,
            double annualInterestRate,
            int numberOfMonths) {

        final double MONTHS_IN_YEAR = 12.0;
        final double PERCENTAGE_CONVERSION = 100.0;

        var monthlyInterestRate =
                annualInterestRate / (MONTHS_IN_YEAR * PERCENTAGE_CONVERSION);

        var loanAmount = principalAmount;

        for (var month = 0; month < numberOfMonths; month++) {
            loanAmount *= (1 + monthlyInterestRate);
        }

        return loanAmount;
    }
}