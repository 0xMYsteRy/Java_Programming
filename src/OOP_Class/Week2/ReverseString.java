package OOP_Class.Week2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = input.nextLine();

        StringBuilder str_b = new StringBuilder(str);
        str_b.reverse();
        System.out.printf("The reverse string of %s is %s",str,str_b);

    }
}
