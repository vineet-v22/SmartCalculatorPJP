package com.savoira.pjp.week5.Assignment1;

public abstract class Loan {

    protected String loanId;
    protected String applicantName;
    protected double principal;
    protected double annualRate;

    public Loan(String loanId, String applicantName,
                double principal, double annualRate) {

        this.loanId = loanId;
        this.applicantName = applicantName;
        this.principal = principal;
        this.annualRate = annualRate;
    }

    public abstract double calculateEMI(int tenureMonths);

    public abstract String loanType();

    public void printSummary(int tenureMonths) {
        System.out.printf(
                "Loan ID: %s | Applicant: %s | Type: %s | Principal: Rs.%.2f | Rate: %.2f%% | EMI: Rs.%.2f%n",
                loanId,
                applicantName,
                loanType(),
                principal,
                annualRate,
                calculateEMI(tenureMonths)
        );
    }
}
