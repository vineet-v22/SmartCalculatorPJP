package com.savoira.pjp.biweekly2;

public final class MathUtils {

    private MathUtils() {
        // prevent instantiation — utility class.
    }

    public static double roundToTwoDecimalPlaces(double value) {

        return Math.round(value * 100.0) / 100.0;
    }

    public static double calculateSimpleInterest(
            double principal,
            double rate,
            double time) {

        return (principal * rate * time) / 100.0;
    }

    public static double calculateCompoundInterest(
            double principal,
            double rate,
            int n,
            double time) {

        return principal
                * Math.pow(
                1 + (rate / (100 * n)),
                n * time
        );
    }
}
