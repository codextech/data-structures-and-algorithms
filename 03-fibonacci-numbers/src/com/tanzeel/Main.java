package com.tanzeel;

public class Main {

    public static void main(String[] args) {
	// Print fibonacci numbers till n numbers
        // printFibonacciNumbers(10);
        fibonacciNumbers(10);
    }


    // method 1
    static void fibonacciNumbers(int n) {
        int firstNumber = 0, secondNumber=1;
        for (int i = 1;  i <= n; i++) {
            System.out.println(firstNumber);
            // swap
            int c =  firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = c;
        }
    }

    // method 2
    static void printFibonacciNumbers(int n) {

        int firstNumber = 0, secondNumber=1;
        int result;

        System.out.println(0);
        System.out.println(1);
        for (int i = 2;  i < n; i++) {
            result = firstNumber + secondNumber;
            // swap
            firstNumber = secondNumber;
            secondNumber = result;

            System.out.println(result);

        }

    }
}
