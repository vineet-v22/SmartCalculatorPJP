package com.savoira;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        log.info("=== SmartCalculator ===");
        log.info("Type 'exit' to quit.");

        while (true) {

            log.info("Enter first number (or 'exit'): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                log.info("User chose to exit the calculator.");
                break;
            }

            double firstNumber;

            try {
                firstNumber = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                log.warn("Invalid number entered: {}", input);
                log.info("Please enter a valid number.");
                continue;
            }

            log.info("Enter Operator (+ - * / %): ");
            String op = sc.nextLine().trim();

            log.info("Enter second number: ");
            double secondNumber;

            try {
                secondNumber = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                log.warn("Invalid second number entered.");
                log.info("Please enter a valid number.");
                continue;
            }

            double result = switch (op) {

                case "+" -> firstNumber + secondNumber;

                case "-" -> firstNumber - secondNumber;

                case "*" -> firstNumber * secondNumber;

                case "/" -> {
                    if (secondNumber == 0) {
                        log.error("Division by zero is not allowed.");
                        yield Double.NaN;
                    }

                    yield firstNumber / secondNumber;
                }

                case "%" -> firstNumber % secondNumber;

                default -> {
                    log.warn("Unknown operator entered: {}", op);
                    yield Double.NaN;
                }
            };

            if (!Double.isNaN(result)) {
                log.info("Result: {}", String.format("%.3f", result));
            }
        }

        sc.close();

        log.info("See you again!");
    }
}