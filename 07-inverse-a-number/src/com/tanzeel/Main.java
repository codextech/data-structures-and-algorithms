package com.tanzeel;

public class Main {

    public static void main(String[] args) {
	// make inverse of number
        /*
        * input: 21453 >> (Position >> Digit)  5>>2 | 4>>1| 3>>4 | 2>>5 | 1>>3 ( 3 is at position 1, 5 is at position 2, 4 is at position 3 and so on...)
        *  Output:
        * 23154 >>  (Position >> Digit) 5>>2 | 4>>3 | 3>>1 | 2>>5 | 1>>4
        *
        *
        * */
        System.out.println(inverseNumber(21453));
    }

    static int inverseNumber(int number) {

        int inverse = 0;
        int position = 1;
       while(number != 0 ) {
           int digit = number % 10;
           int inverse_digit = position;
           int inverse_position = digit;

           inverse += inverse_digit * (int)Math.pow(10, inverse_position-1);
           number = number / 10;
           position++;

       }


        return  inverse;
    }
}
