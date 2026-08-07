package com.savoira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SmartCalculator ===");
        System.out.println("Type 'exit' to quit.");

        while(true){
            System.out.println("Enter first number (or 'exit'): ");
            String input = sc.nextLine().trim();
            if(input.equalsIgnoreCase("exit")) break;

            double a = Double.parseDouble(input);
            System.out.println("Enter Operator (+ - * / %): ");
            String op = sc.nextLine().trim();
            System.out.println("Enter second number: ");
            double b = Double.parseDouble(sc.nextLine().trim());

            double result = switch(op){
                case "+" -> a+b;
                case "-" -> a-b;
                case "*" -> a*b;
                case "/" -> {
                    if(b == 0){
                        System.out.println("Error : division by zero");
                        yield Double.NaN;
                    }
                    else{
                        yield a/b;
                    }
                }
                case "%" -> a%b;
                default -> {
                    System.out.println("Unknown Operator");
                    yield Double.NaN;
                }
            };

            if(!Double.isNaN(result)){
                System.out.printf("Result: %.3f%n", result);
            }
        }

        System.out.println("See You again!");
    }
}