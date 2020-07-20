package Object_Oriented.Chapter10;

class Loan {
    // Data fields
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private java.util.Date loanDate;


    // Constructor
    /*
    Create a default constructor
     */
    public Loan(){
        annualInterestRate = 2.5;
        numberOfYear = 1;
        loanAmount = 1000;
    }

    public Loan(double annualInterestRate_num, int numberOfYear_num, double loanAmount_num){
        this.annualInterestRate = annualInterestRate_num;
        this.numberOfYear = numberOfYear_num;
        this.loanAmount = loanAmount_num;
        loanDate = new java.util.Date();
    }


    // Methods
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnuallInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYear(){
        return numberOfYear;
    }
    public void setNumberOfYear(int numberOfYear){
        this.numberOfYear = numberOfYear;
    }

    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 12 / 100 ;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1+monthlyInterestRate, numberOfYear *12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment= getMonthlyPayment() * numberOfYear * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }

    public static void main(String[] args) {
        Loan Loan1 = new Loan(7.5, 2, 100000000);
        System.out.println("The monthly payment is: ");
        System.out.printf("%5.2f",Loan1.getMonthlyPayment());


    }
}
