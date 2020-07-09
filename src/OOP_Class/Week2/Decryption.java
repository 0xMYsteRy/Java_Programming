package OOP_Class.Week2;

import java.util.Scanner;


public class Decryption {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to decypt: ");
        String str = input.nextLine();

        Decryt_method(str);
    }
    private static void Decryt_method (String str) {

        char[] decrypt = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'R', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'r', 'x', 'y', 'z'};


        char[] txt = {'Q', 'T', 'G', 'A', 'B', 'C', 'D', 'E', 'F', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'q', 't', 'g', 'a', 'b', 'c', 'd', 'e', 'f', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < str.length(); i++) {

            //Print the space
            if (str.charAt(i) == 32) {
                System.out.print(" ");
            }

            //Encrypt the message.
            for (int j = 0; j < txt.length; j++) {
                if (txt[j] == str.charAt(i)) {
                    System.out.print(decrypt[j]);
                }
            }
            //Dmma aqy
        }
    }
}
