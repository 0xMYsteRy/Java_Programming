package OOP_Class.Week3;

/*Implement a class named Account that contains:
        ● A private int data field named id for the account (default 0).
        ● A private double data field named balance for the account (default 0).
        ● A private double data field named annualInterestRate that stores the current
        interest rate (default 0). Assume all accounts have the same interest rate.
        ● A private Date data field named dateCreated that stores the date when the
        account was created.
        ● A no-arg constructor that creates a default account.
        ● A constructor that creates an account with the specified id and initial balance.
        ● The accessor (get) and mutator (set) methods for id, balance, and
        annualInterestRate.
        ● The accessor method for dateCreated.
        ● A method named getMonthlyInterestRate() that returns the monthly interest
          rate.
        ● A method named getMonthlyInterest() that returns the monthly interest.
        ● A method named withdraw that withdraws a specified amount from the
          account.
        ● A method named deposit that deposits a specified amount to the account.
        Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500,
 use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date when this account was created.
Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate and monthlyInterestRate is annualInterestRate / 12.
 Note that annualInterestRate is a percentage, e.g. like 4.5%. You need to divide it by 100.)
 */


import java.time.LocalDate;
import java.util.Date;


class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    Date dateCreated = new Date();

    //A no-arg constructor that creates a default account.
    Account (){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated.getTime();
    }

    // A constructor that creates an account with the specified id and initial balance.
    Account (int id_num, double balance_num, double annualInterestRate_num){
        id = this.id;
        balance = this.balance;
        annualInterestRate_num = this.annualInterestRate;
        dateCreated.getTime();
    }


}
class AccountTest{
    public static void main(String[] args) {

        //Testing
        Account Account1 = new Account();
        System.out.println(Account1.dateCreated);
    }
}
