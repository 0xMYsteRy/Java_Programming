package OOP_Class.Week2;

import java.util.*;

public class SortedArray {
    public static void main(String[] args) {
        int size =1;
        while (size != 0) {
            System.out.print("Please input the list: ");

            Scanner input = new Scanner(System.in);
            size = input.nextInt();

            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = input.nextInt();
            }
            int a = 0;
            for (int i = 0; i < size - 1; i++) {
                if (numbers[i] >= numbers[i + 1]) {
                    a = 1;
                    break;
                }
            }
            if (a == 0 && size != 0) {
                System.out.println("sorted");
            } else if (size==0){
                System.out.println("Goodbye!");
            }
            else{
                System.out.println("not sorted");
            }
        }
    }
}
