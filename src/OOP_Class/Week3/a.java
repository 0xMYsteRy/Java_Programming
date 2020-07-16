package OOP_Class.Week3;

public class IncomeTax {
    // Data fields
    double income;
    int filingType;

    // Constructors
    public IncomeTax(double income, int filingType) {
        this.income = income;
        this.filingType = filingType;
    }

    // Methods
    double calculateTax(double income){
        double tax = 0;
        final double INCOME_POINT[][] = {
                {9875, 40125, 85525, 163300, 207350, 518400},
                {9875, 40125, 85525, 163300, 207350, 518400},
                {19750, 80250, 171050, 326600, 414700, 622050},
                {14100, 53700, 85500, 16300, 207350, 518400}
        };
        final double TAX_RATE[] = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};

        if (income <= INCOME_POINT[0][0]){
            tax = TAX_RATE[0]* income;
        }
    }

}
