package Fundamental.Chapter5;

//Suppose the input is 2 3 4 5 0

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, sum = 0, count;

        for (count = 0; count < 5; count++) {
            number = input.nextInt();
            sum += number;
        }

        System.out.println("sum is " + sum);
        System.out.println("count is " + count);
    }
}
/*
$echo 2 3 4 5 0 >> input_test2.txt
$chmod +x Test2.java
$java Test2.java <input_test2.txt >output_test2.txt
$cat output_test2.txt
-----***-----
    sum is 14
    count is 5
 */