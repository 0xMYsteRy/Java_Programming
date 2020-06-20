package Fundamental.Chapter6;

public class Increment {
    public static void main(String[] args) {

        int x = 1;
        System.out.println("Before the call, x is " + x);

        increment(x);
        System.out.println("After the call, x is " + x);
    }
    public static int increment(int n) {
        n = n + 1;
        System.out.println("x in the mothod is: "+n);
        return n;
    }
}
