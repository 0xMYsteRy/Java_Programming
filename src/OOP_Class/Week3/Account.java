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


    // A no-arg constructor that creates a default account.
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated.getTime();
    }


    // A constructor that creates an account with the specified id and initial balance.
    Account(int id_num, double balance_num, double annualInterestRate_num) {
        this();
        this.id = id_num;
        this.balance = balance_num;
        this.annualInterestRate = annualInterestRate_num;
        dateCreated.getTime();
    }


    // The accessor (get) and mutator (set) methods for id, balance, and annualInterestRate.
    // Get method
    public int getID() {
        return this.id;
    }


    public double getBalance() {
        return this.balance;
    }


    public double getAnnualInterestRate() {
        return this.getAnnualInterestRate();
    }


    // Set method
    // The this. method refer to the value in the declare field.
    //        private int id;
    //        private double balance;
    //        private double annualInterestRate;
    public int setID(int id) {
        return this.id = id;
    }


    public double setBalance(double balance) {
        return this.balance = balance;
    }


    public double setAnnualInterestRate(double annualInterestRate) {
        return this.annualInterestRate = annualInterestRate;
    }


    // The accessor method for dateCreated.
    public Date getDateCreated() {
        return dateCreated;
    }


    // A method named getMonthlyInterestRate() that returns the monthly interest rate.
    private double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }


    // A method named getMonthlyInterest() that returns the monthly interest.
    private double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }


    // A method named withdraw that withdraws a specified amount from the account.
    public double withDraw(double amount) {
        return this.balance -= amount;
    }


    // A method named deposit that deposits a specified amount to the account.
    public double deposit(double amount) {
        return this.balance += amount;
    }
}

class AccountTest {
    public static void main(String[] args) {

        //Testing
        Account Account1 = new Account();
        System.out.println(Account1.dateCreated);
        System.out.println("-----*****-----");

        // Create an account ID of 1122,
        // with initial a balance of $20,000, and an annual interest rate of 4.5%.
        // Use the withdraw method to withdraw $2,500,
        Account Account1122 = new Account(1122, 20000, 4.5);
        System.out.printf("Initial account balance is : %1.2f\n", Account1122.getBalance());
        Account1122.withDraw(2000);
        System.out.printf("After withdraw the balance is: %1.2f", Account1122.getBalance());

        
    }
}
