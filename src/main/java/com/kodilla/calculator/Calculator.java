package com.kodilla.calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String args[]) {

        Calculator calculator = new Calculator();
        double result = calculator.add(50.0,45.5);
        System.out.println(result);

        }
}
