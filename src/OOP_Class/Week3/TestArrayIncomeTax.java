package OOP_Class.Week3;

public class TestArrayIncomeTax {
    public static void main(String[] args) {
        final double INCOME_POINT[][] = {
                {9875, 40125, 85525, 163300, 207350, 518400},
                {9875, 40125, 85525, 163300, 207350, 518400},
                {14100, 53700, 85500, 16300, 207350, 518400},
                {19750, 80250, 171050, 326600, 414700, 622050},
        };
        final double TAX_RATE[] = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
        System.out.println(INCOME_POINT[0][1]);
        System.out.println(INCOME_POINT[1][0]);

        System.out.println(TAX_RATE[0] * INCOME_POINT[0][0] + (INCOME_POINT[0][1] - INCOME_POINT[0][0]) * TAX_RATE[1]);
    }
}
