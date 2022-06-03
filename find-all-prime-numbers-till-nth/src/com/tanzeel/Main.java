package com.tanzeel;

public class Main {

    public static void main(String[] args) {
	// prime numbers from range
     primeNumbers(1, 35);

    }

    static void primeNumbers(int start, int end) {

        for(int i = start ; i <= end ; i++) {
            if (isPrimeNumber(i)) System.out.println(i);
        }

    }

    static boolean isPrimeNumber(int n) {
        if (n <=1){
            return  false;
        } else if( n == 2) {
            return  true;
        } else if (n %2 == 0) {
            return  false;
        }

        for(int i = 3 ; i <= Math.sqrt(n) ; i +=2) {
            if (n % i == 0) return  false;
        }
        return  true;
    }

}
