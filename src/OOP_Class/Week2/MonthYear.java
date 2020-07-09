package OOP_Class.Week2;

import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month: ");
        String month = input.nextLine();


        System.out.println("Enter the year: ");
        int year = input.nextInt();

        String[] months = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] days = {"", "31", "28", "31", "30", "31", "30",
                "31", "31", "30", "31", "30", "31"};
        for (int i = 1; i <= 12; i++) {
            if ((month.toLowerCase().equals("feb")) && (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(months[i] + " " + year + " has 29 days!");
                break;
            } else if (month.toLowerCase().equals(months[i].toLowerCase())) {
                System.out.println(months[i] + " " + year + " has " + days[i] + " days!");
                //System.out.printf("%s %d %s",month, year, days[i]);
            }
        }
    }
}
