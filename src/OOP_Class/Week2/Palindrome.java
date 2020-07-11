package OOP_Class.Week2;

import java.util.Scanner;

//Implement the method

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = input.nextLine();

        StringBuilder str_b = new StringBuilder();

        for (int i=str.length()-1; i >= 0; i--){
            str_b.append(str.charAt(i));
        }
        //System.out.println(str_b);

        //Check the result
        System.out.printf("The given string %s is %s ",str, str_b.toString().equals(str) ? "palirome" : "not palirome");
    }
}
