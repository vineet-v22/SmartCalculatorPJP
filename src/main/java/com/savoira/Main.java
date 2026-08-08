package com.savoira;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SmartCalculator ===");
        System.out.println("Type 'exit' to quit.");

        while (true) {

            System.out.println("Enter first number (or 'exit'): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double FirstNumber;

            try {
                FirstNumber = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            System.out.println("Enter Operator (+ - * / %): ");
            String op = sc.nextLine().trim();

            System.out.println("Enter second number: ");
            double SecondNumber;

            try {
                SecondNumber = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            double result = switch (op) {

                case "+" -> FirstNumber + SecondNumber;

                case "-" -> FirstNumber - SecondNumber;

                case "*" -> FirstNumber * SecondNumber;

                case "/" -> {
                    if (SecondNumber == 0) {
                        System.out.println("Error: Division by zero");
                        yield Double.NaN;
                    }
                    yield FirstNumber / SecondNumber;
                }

                case "%" -> FirstNumber % SecondNumber;

                default -> {
                    System.out.println("Unknown Operator: " + op);
                    yield Double.NaN;
                }
            };

            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.3f%n", result);
            }
        }

        sc.close();

        System.out.println("See You again!");
    }
}