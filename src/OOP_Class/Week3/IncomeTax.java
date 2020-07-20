package OOP_Class.Week3;

import java.util.Scanner;

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
    double calculateTax(double income, int filingType) {

        double tax = 0;
        final double INCOME_POINT[][] = {
                {9875, 40125, 85525, 163300, 207350, 518400},
                {9875, 40125, 85525, 163300, 207350, 311025},
                {19750, 80250, 171050, 326600, 414700, 622050},
                {14100, 53700, 85500, 16300, 207350, 518400},
        };
        final double TAX_RATE[] = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};

        switch (filingType) {

            case 1: // 1: Unmarried individuals
                if (income <= INCOME_POINT[0][0]) {
                    tax = TAX_RATE[0] * income;
                } else if (income <= INCOME_POINT[0][1]) {
                    tax = TAX_RATE[0] * INCOME_POINT[0][0] + (income - INCOME_POINT[0][0]) * TAX_RATE[1];
                } else if (income <= INCOME_POINT[0][2]) {
                    tax = TAX_RATE[0] * INCOME_POINT[0][0] + TAX_RATE[1] * (INCOME_POINT[0][1] - INCOME_POINT[0][0])
                            + TAX_RATE[2] * (income - INCOME_POINT[0][2]);
                } else if (income <= INCOME_POINT[0][3]) {
                    tax = TAX_RATE[0] * INCOME_POINT[0][0] + TAX_RATE[1] * (INCOME_POINT[0][1] - INCOME_POINT[0][0])
                            + TAX_RATE[2] * (INCOME_POINT[0][2] - INCOME_POINT[0][1])
                            + TAX_RATE[3] * (income - INCOME_POINT[0][3]);
                } else if (income <= INCOME_POINT[0][4]) {
                    tax = TAX_RATE[0] * INCOME_POINT[0][0] + TAX_RATE[1] * (INCOME_POINT[0][1] - INCOME_POINT[0][0])
                            + TAX_RATE[2] * (INCOME_POINT[0][2] - INCOME_POINT[0][1])
                            + TAX_RATE[3] * (INCOME_POINT[0][3] - INCOME_POINT[0][2])
                            + TAX_RATE[4] * (income - INCOME_POINT[0][4]);
                } else if (income <= INCOME_POINT[0][5]) {
                    tax = TAX_RATE[0] * INCOME_POINT[0][0] + TAX_RATE[1] * (INCOME_POINT[0][1] - INCOME_POINT[0][0])
                            + TAX_RATE[2] * (INCOME_POINT[0][2] - INCOME_POINT[0][1])
                            + TAX_RATE[3] * (INCOME_POINT[0][3] - INCOME_POINT[0][2])
                            + TAX_RATE[4] * (INCOME_POINT[0][4] - INCOME_POINT[0][3])
                            + TAX_RATE[5] * (income - INCOME_POINT[0][5]);
                } else {
                    tax = TAX_RATE[0] * INCOME_POINT[0][0] + TAX_RATE[1] * (INCOME_POINT[0][1] - INCOME_POINT[0][0])
                            + TAX_RATE[2] * (INCOME_POINT[0][2] - INCOME_POINT[0][1])
                            + TAX_RATE[3] * (INCOME_POINT[0][3] - INCOME_POINT[0][2])
                            + TAX_RATE[4] * (INCOME_POINT[0][4] - INCOME_POINT[0][3])
                            + TAX_RATE[5] * (INCOME_POINT[0][5] - INCOME_POINT[0][4])
                            + TAX_RATE[6] * (income - INCOME_POINT[0][5]);
                }
                break;


            case 2: // 2: Married individuals filing separately
                if (income <= INCOME_POINT[1][0]) {
                    tax = TAX_RATE[0] * income;
                } else if (income <= INCOME_POINT[1][1]) {
                    tax = TAX_RATE[0] * INCOME_POINT[1][0] + (income - INCOME_POINT[1][0]) * TAX_RATE[1];
                } else if (income <= INCOME_POINT[1][2]) {
                    tax = TAX_RATE[0] * INCOME_POINT[1][0] + TAX_RATE[1] * (INCOME_POINT[1][1] - INCOME_POINT[1][0])
                            + TAX_RATE[2] * (income - INCOME_POINT[1][2]);
                } else if (income <= INCOME_POINT[1][3]) {
                    tax = TAX_RATE[0] * INCOME_POINT[1][0] + TAX_RATE[1] * (INCOME_POINT[1][1] - INCOME_POINT[1][0])
                            + TAX_RATE[2] * (INCOME_POINT[1][2] - INCOME_POINT[1][1])
                            + TAX_RATE[3] * (income - INCOME_POINT[1][3]);
                } else if (income <= INCOME_POINT[1][4]) {
                    tax = TAX_RATE[0] * INCOME_POINT[1][0] + TAX_RATE[1] * (INCOME_POINT[1][1] - INCOME_POINT[1][0])
                            + TAX_RATE[2] * (INCOME_POINT[1][2] - INCOME_POINT[1][1])
                            + TAX_RATE[3] * (INCOME_POINT[1][3] - INCOME_POINT[1][2])
                            + TAX_RATE[4] * (income - INCOME_POINT[1][4]);
                } else if (income <= INCOME_POINT[1][5]) {
                    tax = TAX_RATE[0] * INCOME_POINT[1][0] + TAX_RATE[1] * (INCOME_POINT[1][1] - INCOME_POINT[1][0])
                            + TAX_RATE[2] * (INCOME_POINT[1][2] - INCOME_POINT[1][1])
                            + TAX_RATE[3] * (INCOME_POINT[1][3] - INCOME_POINT[1][2])
                            + TAX_RATE[4] * (INCOME_POINT[1][4] - INCOME_POINT[1][3])
                            + TAX_RATE[5] * (income - INCOME_POINT[1][5]);
                } else {
                    tax = TAX_RATE[0] * INCOME_POINT[1][0] + TAX_RATE[1] * (INCOME_POINT[1][1] - INCOME_POINT[1][0])
                            + TAX_RATE[2] * (INCOME_POINT[1][2] - INCOME_POINT[1][1])
                            + TAX_RATE[3] * (INCOME_POINT[1][3] - INCOME_POINT[1][2])
                            + TAX_RATE[4] * (INCOME_POINT[1][4] - INCOME_POINT[1][3])
                            + TAX_RATE[5] * (INCOME_POINT[1][5] - INCOME_POINT[1][4])
                            + TAX_RATE[6] * (income - INCOME_POINT[1][5]);
                }
                break;


            case 3: // 3: Married individuals filing jointly
                if (income <= INCOME_POINT[2][0]) {
                    tax = TAX_RATE[0] * income;
                } else if (income <= INCOME_POINT[2][1]) {
                    tax = TAX_RATE[0] * INCOME_POINT[2][0] + (income - INCOME_POINT[2][0]) * TAX_RATE[1];
                } else if (income <= INCOME_POINT[2][2]) {
                    tax = TAX_RATE[0] * INCOME_POINT[2][0] + TAX_RATE[1] * (INCOME_POINT[2][1] - INCOME_POINT[2][0])
                            + TAX_RATE[2] * (income - INCOME_POINT[2][2]);
                } else if (income <= INCOME_POINT[2][3]) {
                    tax = TAX_RATE[0] * INCOME_POINT[2][0] + TAX_RATE[1] * (INCOME_POINT[2][1] - INCOME_POINT[2][0])
                            + TAX_RATE[2] * (INCOME_POINT[2][2] - INCOME_POINT[2][1])
                            + TAX_RATE[3] * (income - INCOME_POINT[2][3]);
                } else if (income <= INCOME_POINT[2][4]) {
                    tax = TAX_RATE[0] * INCOME_POINT[2][0] + TAX_RATE[1] * (INCOME_POINT[2][1] - INCOME_POINT[2][0])
                            + TAX_RATE[2] * (INCOME_POINT[2][2] - INCOME_POINT[2][1])
                            + TAX_RATE[3] * (INCOME_POINT[2][3] - INCOME_POINT[2][2])
                            + TAX_RATE[4] * (income - INCOME_POINT[2][4]);
                } else if (income <= INCOME_POINT[2][5]) {
                    tax = TAX_RATE[0] * INCOME_POINT[2][0] + TAX_RATE[1] * (INCOME_POINT[2][1] - INCOME_POINT[2][0])
                            + TAX_RATE[2] * (INCOME_POINT[2][2] - INCOME_POINT[2][1])
                            + TAX_RATE[3] * (INCOME_POINT[2][3] - INCOME_POINT[2][2])
                            + TAX_RATE[4] * (INCOME_POINT[2][4] - INCOME_POINT[2][3])
                            + TAX_RATE[5] * (income - INCOME_POINT[2][5]);
                } else {
                    tax = TAX_RATE[0] * INCOME_POINT[2][0] + TAX_RATE[1] * (INCOME_POINT[2][1] - INCOME_POINT[2][0])
                            + TAX_RATE[2] * (INCOME_POINT[2][2] - INCOME_POINT[2][1])
                            + TAX_RATE[3] * (INCOME_POINT[2][3] - INCOME_POINT[2][2])
                            + TAX_RATE[4] * (INCOME_POINT[2][4] - INCOME_POINT[2][3])
                            + TAX_RATE[5] * (INCOME_POINT[2][5] - INCOME_POINT[2][4])
                            + TAX_RATE[6] * (income - INCOME_POINT[2][5]);
                }
                break;


            case 4: // 4: Heads of households
                if (income <= INCOME_POINT[3][0]) {
                    tax = TAX_RATE[0] * income;
                } else if (income <= INCOME_POINT[3][1]) {
                    tax = TAX_RATE[0] * INCOME_POINT[3][0] + (income - INCOME_POINT[3][0]) * TAX_RATE[1];
                } else if (income <= INCOME_POINT[3][2]) {
                    tax = TAX_RATE[0] * INCOME_POINT[3][0] + TAX_RATE[1] * (INCOME_POINT[3][1] - INCOME_POINT[3][0])
                            + TAX_RATE[2] * (income - INCOME_POINT[2][2]);
                } else if (income <= INCOME_POINT[3][3]) {
                    tax = TAX_RATE[0] * INCOME_POINT[3][0] + TAX_RATE[1] * (INCOME_POINT[3][1] - INCOME_POINT[3][0])
                            + TAX_RATE[2] * (INCOME_POINT[3][2] - INCOME_POINT[3][1])
                            + TAX_RATE[3] * (income - INCOME_POINT[3][3]);
                } else if (income <= INCOME_POINT[3][4]) {
                    tax = TAX_RATE[0] * INCOME_POINT[3][0] + TAX_RATE[1] * (INCOME_POINT[3][1] - INCOME_POINT[3][0])
                            + TAX_RATE[2] * (INCOME_POINT[3][2] - INCOME_POINT[3][1])
                            + TAX_RATE[3] * (INCOME_POINT[3][3] - INCOME_POINT[3][2])
                            + TAX_RATE[4] * (income - INCOME_POINT[3][4]);
                } else if (income <= INCOME_POINT[3][5]) {
                    tax = TAX_RATE[0] * INCOME_POINT[3][0] + TAX_RATE[1] * (INCOME_POINT[3][1] - INCOME_POINT[3][0])
                            + TAX_RATE[2] * (INCOME_POINT[3][2] - INCOME_POINT[3][1])
                            + TAX_RATE[3] * (INCOME_POINT[3][3] - INCOME_POINT[3][2])
                            + TAX_RATE[4] * (INCOME_POINT[3][4] - INCOME_POINT[3][3])
                            + TAX_RATE[5] * (income - INCOME_POINT[3][5]);
                } else {
                    tax = TAX_RATE[0] * INCOME_POINT[3][0] + TAX_RATE[1] * (INCOME_POINT[3][1] - INCOME_POINT[3][0])
                            + TAX_RATE[2] * (INCOME_POINT[3][2] - INCOME_POINT[3][1])
                            + TAX_RATE[3] * (INCOME_POINT[3][3] - INCOME_POINT[3][2])
                            + TAX_RATE[4] * (INCOME_POINT[3][4] - INCOME_POINT[3][3])
                            + TAX_RATE[5] * (INCOME_POINT[3][5] - INCOME_POINT[3][4])
                            + TAX_RATE[6] * (income - INCOME_POINT[3][5]);
                }
                break;
        }


        return tax;
    }
}

class IncomeTaxTest {
    public static void main(String[] args) {

        // Get user option
        System.out.println("The United States Federal Income Tax Rates for 2020 has four types of tax filers.\n" +
                "1: Unmarried individuals\n" +
                "2: Married individuals filing separately\n" +
                "3: Married individuals filing jointly\n" +
                "4: Heads of households");
        System.out.print("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int user_choice = input.nextInt();

        // Get user income
        System.out.println("Enter your income: ");
        int user_income = input.nextInt();

        // Create a new instance
        IncomeTax personIncomeTax = new IncomeTax(user_income, user_choice);

        // Display the result
        System.out.printf("Your income tax is %1.2f", personIncomeTax.calculateTax(user_income, user_choice));
    }
}
