package com.savoira.pjp.week5.Assignment2;

import java.util.HashSet;
import java.util.Set;

public class LoanDemo {

    public static void main(String[] args) {

        HomeLoan homeLoan = new HomeLoan(
                "HL101",
                "Vineet Verma",
                5000000,
                8.5
        );

        PersonalLoan personalLoan1 = new PersonalLoan(
                "PL101",
                "Rahul Sharma",
                500000,
                12.0,
                60
        );

        PersonalLoan personalLoan2 = new PersonalLoan(
                "PL102",
                "Priya Singh",
                300000,
                10.5,
                48
        );

        // Auditable reference
        Auditable audit = homeLoan;

        System.out.println(audit.auditSummary());

        // Exportable reference
        Exportable export = personalLoan1;

        System.out.println(export.toCSVRow());

        // HashSet test
        HomeLoan duplicateHomeLoan = new HomeLoan(
                "hl101",
                "Another Applicant",
                7000000,
                9.0
        );

        Set<Loan> loans = new HashSet<>();

        loans.add(homeLoan);
        loans.add(duplicateHomeLoan);

        System.out.println("HashSet size: " + loans.size());

        // Additional loans
        loans.add(personalLoan1);
        loans.add(personalLoan2);

        System.out.println("HashSet size after adding all loans: "
                + loans.size());
    }
}
