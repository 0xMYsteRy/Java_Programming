package OOP_Class.Week2;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class CitiesOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the use to enter the three cities
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.println("Enter the third city: ");
        String city3 = input.nextLine();

        ArrayList<String> Cities = new ArrayList<String>();
        Cities.add(city1);
        Cities.add(city2);
        Cities.add(city3);
        Collections.sort(Cities);

        //Display the result
        System.out.print("The three cities in alphabetical order are: ");
        for (String city : Cities) {
            System.out.print(city + " ");
        }
    }
}
