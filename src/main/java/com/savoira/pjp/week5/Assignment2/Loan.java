package com.savoira.pjp.week5.Assignment2;
import java.util.Objects;

public abstract class Loan implements Auditable {

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

    @Override
    public String getLoanId() {
        return loanId;
    }

    @Override
    public String getApplicantName() {
        return applicantName;
    }

    @Override
    public double getPrincipal() {
        return principal;
    }

    @Override
    public double getAnnualRate() {
        return annualRate;
    }

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

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Loan other)) {
            return false;
        }

        return loanId.equalsIgnoreCase(other.loanId);
    }

    @Override
    public int hashCode() {
        return loanId.toLowerCase().hashCode();
    }
}
