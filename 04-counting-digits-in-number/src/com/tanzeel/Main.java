package com.tanzeel;

public class Main {

    public static void main(String[] args) {
        // counting digits in a number
        /*
         * Input: 90012
         * Output: 5
         */
//        int result = countDigits(90012);
        int result =countDigitsWithWhileLoop(90012);
        System.out.println(result);

    }

    //    method 1
    static int countDigitsWithWhileLoop(int number) {

        if (number < 0) number = number * (-1);; // make positive

        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    //    method 2
    static int countDigits(int number) {

        if (number < 0) number = number * (-1);
        ; // make positive

        int count = 0;
        for (int i = 0; number > 0; i++)

            if (number > 0) {
                number = number / 10;
                count++;
            } else {
                break;
            }


        return count;
    }


}




