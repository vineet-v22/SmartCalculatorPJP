package com.savoira.pjp.week5.Assignment1;
import java.util.ArrayList;
import java.util.List;

public class LoanDemo {

    public static void main(String[] args) {

        List<Loan> loans = new ArrayList<>();

        loans.add(new HomeLoan(
                "HL101",
                "Vineet Verma",
                5000000,
                8.5
        ));

        loans.add(new PersonalLoan(
                "PL101",
                "Rahul Sharma",
                500000,
                12.0
        ));

        loans.add(new PersonalLoan(
                "PL102",
                "Priya Singh",
                300000,
                10.5
        ));

        int homeLoanTenure = 240;
        int personalLoanTenure = 60;

        for (Loan loan : loans) {

            int tenure;

            if (loan instanceof HomeLoan) {
                tenure = homeLoanTenure;
            } else {
                tenure = personalLoanTenure;
            }

            loan.printSummary(tenure);
            System.out.println("Loan Type: " + loan.loanType());
            System.out.println();
        }
    }
}
