package Chapter3;

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer," +
                        " 1-married jointly or " + "qualifying widow(er)," +
                        " 2-married separately," +
                        " 3-head of " + "household)\n Enter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        /*
        2020 tax data is here
        https://www.bankrate.com/finance/taxes/tax-brackets.aspx
        Slightly decrease tax of lower income individual
        Increase tax of high income individual
         */

        double tax = 0;
        // Compute tax for single filers
        if (status == 0) {
            if (income <= 9700)
                tax = income * 0.10;
            else if (income <= 39475)
                tax = 9700 * 0.10 + (income - 9700) * 0.12;
            else if (income <= 84200)
                tax = 9700 * 0.10 + (39475 - 9700) * 0.12 + (income - 39475) * 0.22;
            else if (income <= 160725)
                tax = 9700 * 0.10 + (39475 - 9700) * 0.12 + (84200 - 33950) * 0.22 + (income - 84200) * 0.24;
            else if (income <= 204100)
                tax = 9700 * 0.10 + (39475 - 9700) * 0.12 +
                        (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 +
                        (income - 160725) * 0.32;
            else if (income <= 510300)
                tax = 9700 * 0.10 + (39475 - 9700) * 0.12 +
                        (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 +
                        (204100 - 160725) * 0.32 + (income - 204100) * 0.35;
            else {
                tax = 9700 * 0.10 + (39475 - 9700) * 0.12 +
                        (84200 - 39475) * 0.22 + (160725 - 84200) * 0.24 +
                        (204100 - 160725) * 0.32 + (510300 - 204100) * 0.35 + (income - 510300) * 0.37;
            }
        }

        /*
        MARRIED FILING JOINTLY OR QUALIFYING WIDOW
        $0 to $19,400
        $19,401 to $78,950
        $78,951 to $168,400
        $168,401 to $321,450
        $321,451 to $408,200
        $408,201 to $612,350
        $612,351 or more
         */

        else if (status == 1) {
            if (income <= 19400)
                tax = income * 0.10;
            else if (income <= 78950)
                tax = 19400 * 0.10 + (income - 19400) * 0.12;
            else if (income <= 168400)
                tax = 19400 * 0.10 + (78950 - 19400) * 0.12 + (income - 78950) * 0.22;
            else if (income <= 321450)
                tax = 19400 * 0.10 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22 + (income - 168400) * 0.24;
            else if (income <= 408200)
                tax = 19400 * 0.10 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22
                        + (321450 - 168499) * 0.24 + (income - 321450) * 0.32;
            else if (income <= 612350)
                tax = 19400 * 0.10 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22
                        + (321450 - 168499) * 0.24 + (408200 - 321450) * 0.32 + (income - 408200) * 0.35;
            else {
                tax = 19400 * 0.10 + (78950 - 19400) * 0.12 + (168400 - 78950) * 0.22
                        + (321450 - 168499) * 0.24 + (408200 - 321450) * 0.32 + (612350 - 408200) * 0.35
                        + (income - 612350) * 0.37;
            }
        }

        /*
        MARRIED FILING SEPARATELY
        $0 to $9,700
        $9,701 to $39,475
        $39,476 to $84,200
        $84,201 to $160,725
        $160,726 to $204,100
        $204,101 to $306,175
        $306,176 or more
         */

        else if (status == 2) {
        }



        else if (status == 3) {
        }

        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}
