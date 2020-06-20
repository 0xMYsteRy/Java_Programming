package Fundamental.Chapter7;

public class CountLettersInArray {
    public static void main(String[] args) {

        char[] chars = createArray();

        System.out.println("The lowercase letters are:");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    private static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }

    private static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        return chars;
    }

    private static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++){

            //Every 20 char will create a new line
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            }
            //Otherwise the character will be print normally
            else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    private static int[] countLetters(char[] chars) {
        int counts[] = new int[26];

        for (int i = 0; i < chars.length; i++ ) {
            counts[chars[i] - 'a']++;
        }
        /*
        Bruteforce approach
        for (int i = 0; i < chars.length; i++)
            if (chars[i] == 'a')
                counts[0]++;
            else if (chars[i] == 'b')
                counts[1]++;
                ...
         */

        return counts;
    }

    
}
