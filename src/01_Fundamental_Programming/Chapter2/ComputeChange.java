package Chapter2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in double, for e.g 11.56: ");

        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfONeDollar = remainingAmount / 100;

        remainingAmount = remainingAmount % 100;

        int numberOfQuarter = remainingAmount / 25;

        remainingAmount = remainingAmount % 25;

        int numberOfDime = remainingAmount / 10;

        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;

        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        //Display the results
        System.out.println("Your amount " + amount + " consist of: ");
        System.out.println("  " + numberOfONeDollar + " Dollars");
        System.out.println("  " + numberOfQuarter + " Quarter");
        System.out.println("  " + numberOfDime + " Dime");
        System.out.println("  " + numberOfNickels + " Nickles");
        System.out.println("  " + numberOfPennies + " Pennies");

    }
}
