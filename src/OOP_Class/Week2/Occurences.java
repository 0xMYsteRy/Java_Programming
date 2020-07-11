package OOP_Class.Week2;

import java.util.*;

public class Occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[100];
        int[] count = new int[100];

        int i, occurance = 0;
        System.out.println("Enter the integers between 1 and 100: ");


        for (i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
            if (num[i] == 0) {
                break;
            }
        }


        for (i = 0; i < num.length; i++) {
            occurance = num[i];
            count[occurance]++;
        }

        for (i = 1; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.printf("%d occurs %d time\n", i, count[i]);
            } else {
                System.out.printf("%d occurs %d times\n", i, count[i]);
            }

        }

    }
}
