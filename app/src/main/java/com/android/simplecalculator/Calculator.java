package com.android.simplecalculator;

public class Calculator {
    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POW, FACT, LOG}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    /**
     * Power operation
     */
    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }

    /**
     * factorial
     */
    public double factorial(double firstOperand) {
        if (firstOperand > 0) {
            return firstOperand * factorial(firstOperand - 1);
        } else {
            return 1;
        }
    }
    /**
     * Logarit operation
     */
    public double log(double firstOperand, double secondOperand)
    {
        return Math.log(firstOperand) / Math.log(secondOperand);
    }
}
