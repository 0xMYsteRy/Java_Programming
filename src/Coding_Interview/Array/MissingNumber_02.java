package Coding_Interview.Array;

public class MissingNumber_02 {
    public static void main(String[] args) {

        int[] arr1={7,5,6,1,4,2};
        System.out.printf("The missing number is %d\n",missingNumber(arr1));

        int[] arr2={5,3,1,2};
        System.out.printf("The missing number is %d",missingNumber(arr2));
    }

    public static int missingNumber(int[] arr){

        //Find the sum of array of number using the formula sum = n(n+1)/2
        int sum = ((arr.length+1)*(arr.length+1+1)) / 2;
        int restSum = 0;

        for (int i : arr) {
            restSum += i;
        }
        return sum - restSum;
    }
}
