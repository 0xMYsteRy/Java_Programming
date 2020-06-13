package Chapter5;

import java.util.Scanner;

// input is 2 3 4 5 0
public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}

// Create test_input file: $echo 2 3 4 5 0 >> test_input.txt
// User terminal to get the input file: $java Test < test_input.txt > test_output.txt
// View the file by: $cat test_output.txt