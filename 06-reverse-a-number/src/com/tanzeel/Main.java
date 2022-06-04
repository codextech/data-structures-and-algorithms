package com.tanzeel;

public class Main {

    public static void main(String[] args) {
	// reverse a number
        /*
        *
        * Input: 28901
        * Output:
        * 1
        * 0
        * 9
        * 8
        * 2
        * */
        reverseNumber(28901);
    }

    static void reverseNumber(int number) {

       while(number !=0){
           int digit = number % 10;
           number = number /10;
           System.out.println(digit);
       }

    }
}
