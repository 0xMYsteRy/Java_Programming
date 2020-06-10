package Chapter5;

import java.util.Scanner;

//Will be implemented by using Math.sqrt() later

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are: ");

        while (count < NUMBER_OF_PRIMES) {

            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                }
                else {
                    System.out.printf(number+ "   ");
                }
            }
            number++;
        }
    }
}
