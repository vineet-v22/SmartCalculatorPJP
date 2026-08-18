package com.savoira.pjp.biweekly2;

public class Demo {

    public static void main(String[] args) {

        double roundedValue =
                MathUtils.roundToTwoDecimalPlaces(123.4567);

        double simpleInterest =
                MathUtils.calculateSimpleInterest(
                        10000,
                        5,
                        2
                );

        double compoundInterest =
                MathUtils.calculateCompoundInterest(
                        10000,
                        5,
                        4,
                        2
                );

        System.out.printf(
                "Rounded value: %.2f%n",
                roundedValue
        );

        System.out.printf(
                "Simple Interest: %.2f%n",
                simpleInterest
        );

        System.out.printf(
                "Compound Interest: %.2f%n",
                compoundInterest
        );
    }
}