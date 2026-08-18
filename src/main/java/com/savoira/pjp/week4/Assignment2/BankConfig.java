package com.savoira.pjp.week4.Assignment2;

public final class BankConfig {

    public static final double MAX_DEPOSIT = 500_000.0;
    public static final double MAX_WITHDRAWAL = 200_000.0;
    public static final int MAX_DAILY_TXN = 10;

    private BankConfig() {
        // Prevent object creation
    }
}