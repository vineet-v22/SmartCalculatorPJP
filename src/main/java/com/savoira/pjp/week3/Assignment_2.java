package org.example;

import java.util.Scanner;

public class Assignment_2 {

    void smartCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            System.out.print("Enter first number or exit to quit: ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int firstNum = Integer.parseInt(input);
            System.out.print("Enter second number: ");
            int secondNum = sc.nextInt();
            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);
            sc.nextLine();

            switch (operator) {
                case '+':
                    System.out.printf("Result: %.2f%n", (double) (firstNum + secondNum));
                    break;

                case '-':
                    System.out.printf("Result: %.2f%n", (double) (firstNum - secondNum));
                    break;

                case '*':
                    System.out.printf("Result: %.2f%n", (double) (firstNum * secondNum));
                    break;

                case '/':
                    if (secondNum == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.printf("Result: %.2f%n",
                                (double) firstNum / secondNum);
                    }
                    break;

                case '%':
                    if (secondNum == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.printf("Result: %.2f%n",
                                (double) firstNum % secondNum);
                    }
                    break;

                default:
                    System.out.println("Error: Unknown operator '" + operator + "'");
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        Assignment_2 calculator = new Assignment_2();
        calculator.smartCalc();
    }
}