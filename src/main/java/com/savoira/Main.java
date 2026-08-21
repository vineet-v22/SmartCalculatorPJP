package com.savoira;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Entry point of the SmartCalculator application.
 * Handles user input and interacts with the Calculator class.
 */
public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    /**
     * Starts the SmartCalculator application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        LOG.info("=== SmartCalculator ===");
        LOG.info("Type 'exit' to quit.");

        while (true) {
            LOG.info("Enter operator (+ - * / % sqrt percent): ");
            String operator = sc.nextLine().trim();

            if (operator.equalsIgnoreCase("sqrt")) {

                LOG.info("Enter number: ");
                String input = sc.nextLine().trim();
                double number;
                try {
                    number = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    LOG.warn("Invalid number entered: {}", input);
                    LOG.info("Please enter a valid number.");
                    continue;
                }

                double result = Calculator.squareRoot(number);
                LOG.info("Result: {}", String.format("%.3f", result));
                continue;

            }

            LOG.info("Enter first number (or 'exit'): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                LOG.info("User chose to exit the calculator.");
                break;
            }

            double firstNumber;

            try {
                firstNumber = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                LOG.warn("Invalid number entered: {}", input);
                LOG.info("Please enter a valid number.");
                continue;
            }

            LOG.info("Enter second number: ");
            double secondNumber;

            try {
                secondNumber = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                LOG.warn("Invalid second number entered.");
                LOG.info("Please enter a valid number.");
                continue;
            }

            Operation operation =
                    new Operation(firstNumber, operator, secondNumber);

            double result = calculator.calculate(operation);

            if (!Double.isNaN(result)) {
                LOG.info("Result: {}", String.format("%.3f", result));
            }
        }

        sc.close();

        LOG.info("See you again!");
    }
}