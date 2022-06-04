package com.tanzeel;

public class Main {

    public static void main(String[] args) {
	// print all digits of number
        /*
        * Input: 4510
        * Output:
        * 4
        * 5
        * 1
        * 0
        * */
        printNumbers(4510);
    }

    static void printNumbers(int number) {

        int digits = countNumbers(number);
        int divider = (int)Math.pow(10, digits-1);

        while (divider != 0) {
            int dig = number / divider;
            System.out.println(dig);
            number = number % divider;

            divider = divider/10 ;
        }


    }

    static int countNumbers(int number) {

        if (number < 0) number = number * (-1); // make positive

        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;

    }
}
