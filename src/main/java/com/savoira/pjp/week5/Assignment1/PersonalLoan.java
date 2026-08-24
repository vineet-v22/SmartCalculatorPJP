package com.savoira.pjp.week5.Assignment1;

public class PersonalLoan extends Loan {

    public PersonalLoan(String loanId, String applicantName,
                        double principal, double annualRate) {

        super(loanId, applicantName, principal, annualRate);
    }

    @Override
    public double calculateEMI(int tenureMonths) {

        double interest = principal
                * annualRate / 100
                * tenureMonths / 12;

        return (principal + interest) / tenureMonths;
    }

    @Override
    public String loanType() {
        return "Personal Loan";
    }
}
