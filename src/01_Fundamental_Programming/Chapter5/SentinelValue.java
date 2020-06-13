package Chapter5;

import java.util.*;

public class SentinelValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
                "Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;

//            System.out.print(
//                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt(); }
        System.out.println("The sum is " + sum);
    }
}

// Get the ouput on terminal by;
// java SentinelValue.java < input.txt -o output.txt