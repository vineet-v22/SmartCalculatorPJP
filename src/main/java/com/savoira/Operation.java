package com.savoira;

/**
 * Represents a mathematical operation containing two operands
 * and an operator.
 */
public class Operation {

    private double firstNumber;
    private String operator;
    private double secondNumber;

    /**
     * Creates an Operation with two operands and an operator.
     *
     * @param firstNumber  the first operand
     * @param operator     the mathematical operator
     * @param secondNumber the second operand
     */
    public Operation(double firstNumber, String operator, double secondNumber) {
        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
    }

    /**
     * Returns the first operand.
     *
     * @return the first operand
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Returns the operator.
     *
     * @return the mathematical operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Returns the second operand.
     *
     * @return the second operand
     */
    public double getSecondNumber() {
        return secondNumber;
    }
}