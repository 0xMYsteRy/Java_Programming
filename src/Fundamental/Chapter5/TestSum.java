package Fundamental.Chapter5;

public class TestSum {
    public static void main(String[] args) {

        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
/*
The result is imprecise because computers use a fixed number of bits to represent floating-point numbers,
and thus they cannot represent some floating-point numbers exactly.
 */
