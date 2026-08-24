package com.savoira.pjp.week5.Assignment2;

public class HomeLoan extends Loan {

    public HomeLoan(String loanId, String applicantName,
                    double principal, double annualRate) {

        super(loanId, applicantName, principal, annualRate);
    }

    @Override
    public double calculateEMI(int tenureMonths) {

        double monthlyRate = annualRate / 12 / 100;

        double power = Math.pow(1 + monthlyRate, tenureMonths);

        return (principal * monthlyRate * power)
                / (power - 1);
    }

    @Override
    public String loanType() {
        return "Home Loan";
    }
}
