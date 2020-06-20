package Fundamental.Chapter2;

import javax.swing.JOptionPane;

public class ComputeLoan {
    public static void main(String[] args) {

        // Convert String to double & obtain monthly interest rate
        String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate: ");
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years & convert to int
        String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years as an int \nFor example 5: ");
        int numberOFYears = Integer.parseInt(numberOfYearsString);

        // Enter loan amount and convert to double:
        String loanAmountString = JOptionPane.showInputDialog("Enter the loan amount");
        double loanAmount = Double.parseDouble(loanAmountString);

        // Calculate payment
        double monthlyPayment = (loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOFYears * 12)));
        double totalPayment = (monthlyPayment * 12 * numberOFYears);

        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment = (int)(totalPayment * 100) / 100.0;

        //Display the result message
        String result = "The monthly payment is: " + monthlyPayment + "\nThe total payment is: " + totalPayment;
        JOptionPane.showMessageDialog(null, result);
    }
}
