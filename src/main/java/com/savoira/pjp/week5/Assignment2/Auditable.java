package com.savoira.pjp.week5.Assignment2;

public interface Auditable {

    default String auditPrefix() {
        return "[AUDIT] ";
    }

    default String auditSummary() {
        return auditPrefix()
                + getLoanId()
                + " | "
                + getApplicantName()
                + " | Rs."
                + String.format("%.2f", getPrincipal())
                + " | Rate:"
                + getAnnualRate()
                + "%";
    }

    String getLoanId();

    String getApplicantName();

    double getPrincipal();

    double getAnnualRate();
}
