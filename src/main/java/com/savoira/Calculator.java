package com.savoira;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Performs mathematical calculations for SmartCalculator.
 */
public class Calculator {

    private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

    /**
     * Calculates the result of the given operation.
     *
     * @param operation the operation to calculate
     * @return the calculated result, or NaN for an invalid operation
     */
    public double calculate(Operation operation) {

        double firstNumber = operation.getFirstNumber();
        String operator = operation.getOperator();
        double secondNumber = operation.getSecondNumber();

        return switch (operator) {

            case "+" -> firstNumber + secondNumber;

            case "-" -> firstNumber - secondNumber;

            case "*" -> firstNumber * secondNumber;

            case "/" -> {
                if (secondNumber == 0) {
                    LOG.error("Division by zero is not allowed.");
                    yield Double.NaN;
                }

                yield firstNumber / secondNumber;
            }

            case "%" -> (firstNumber % secondNumber);

            case "percent" -> percentage(firstNumber, secondNumber);

            default -> {
                LOG.warn("Unknown operator entered: {}", operator);
                yield Double.NaN;
            }
        };
    }

    /**
     * Calculates the remainder percentage operation.
     *
     * @param firstNumber  the first operand
     * @param secondNumber the second operand
     * @return the remainder of the two numbers
     */
    public static double percentage(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber) / 100;
    }

    /**
     * Calculates the square root of a number.
     *
     * @param number the number whose square root is required
     * @return the square root of the number
     */
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }
}