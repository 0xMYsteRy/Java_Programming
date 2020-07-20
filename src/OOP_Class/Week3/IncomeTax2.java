package OOP_Class.Week3;

import java.util.Arrays;
import java.util.Scanner;

public class IncomeTax2 {


    static class IncomeTax {
        private double income = 0;
        private int taxFiler = 0;
        double[] taxratePercent = new double[]{0, 10, 12, 22, 24, 32, 35, 37};
        double[][] taxrate = new double[][]{
                {0, 0, 0, 0},
                {19750, 9875, 14100, 9875},
                {80250, 40125, 53700, 40125},
                {171050, 80525, 85500, 85525},
                {326600, 163300, 163300, 163300},
                {414700, 207350, 207350, 207350},
                {622050, 518400, 518400, 311025}
        };
        double[][] taxValueConstant = new double[7][4];

        public IncomeTax(double income, int taxFiler) {
            this.income = income;
            this.taxFiler = taxFiler - 1;
        }

        public IncomeTax() {
        }

        public void findValue() {
            System.out.println(Arrays.deepToString(taxrate));
            for (int y = 0; y < 4; y++) {
                for (int x = 1; x < 7; x++) {
                    taxValueConstant[x][y] = (taxrate[x][y] - taxrate[x - 1][y]) * taxratePercent[x] / 100 + taxValueConstant[x - 1][y];
                }
            }
            System.out.println(Arrays.deepToString(taxValueConstant));
        }

        public double findValuebyIncome() {
            for (int y = 0; y < 4; y++) {
                for (int x = 1; x < 7; x++) {
                    taxValueConstant[x][y] = (taxrate[x][y] - taxrate[x - 1][y]) * taxratePercent[x] / 100 + taxValueConstant[x - 1][y];
                }
            }
            double totalTax = 0, overcome = 0;
            for (int ii = 1; ii < 7; ii++) {
                if (income < taxrate[ii][taxFiler]) {
                    overcome = (income - taxrate[ii - 1][taxFiler]) * taxratePercent[ii] / 100;
                    totalTax = overcome + taxValueConstant[ii - 1][taxFiler];
                    break;
                }
            }
            if (income >= taxrate[6][taxFiler]) {
                totalTax = (income - taxrate[6][taxFiler]) * taxratePercent[7] / 100 + taxValueConstant[6][taxFiler];
            }
            return totalTax;
        }

        public double showTax(int Filer, double Inc) {
            taxFiler = Filer - 1;
            income = Inc;
            for (int y = 0; y < 4; y++) {
                for (int x = 1; x < 7; x++) {
                    taxValueConstant[x][y] = (taxrate[x][y] - taxrate[x - 1][y]) * taxratePercent[x] / 100 + taxValueConstant[x - 1][y];
                }
            }
            double totalTax = 0, overcome = 0;
            for (int ii = 1; ii < 7; ii++) {
                if (income < taxrate[ii][taxFiler]) {
                    overcome = (income - taxrate[ii - 1][taxFiler]) * taxratePercent[ii] / 100;
                    totalTax = overcome + taxValueConstant[ii - 1][taxFiler];
                    break;
                }
            }
            if (income >= taxrate[6][taxFiler]) {
                totalTax = (income - taxrate[6][taxFiler]) * taxratePercent[7] / 100 + taxValueConstant[6][taxFiler];
            }
            return totalTax;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. For married individuals filing jointly\n" +
                "2. For unmarried individuals\n" +
                "3. For heads of households:\n" +
                "4. For married individuals filing separately:\n" +
                "Choose your current status: ");
        int taxFiler = input.nextInt();
        System.out.print("Please input your current Income: ");
        int income = input.nextInt();
        IncomeTax a = new IncomeTax(income, taxFiler);
        System.out.printf("Your annual Tax is : %.2f\n", a.findValuebyIncome());
        IncomeTax all = new IncomeTax();
        //System.out.println(all.showTax(4, 700000));
    }

}
