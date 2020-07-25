package Coding_Interview.Array;

class FindLargestSmallestNumber_01 {
    public int FindLargestSmallestNumber_01(){

        // Create an array of 10 numbers
        int[] arr = new int[]{12,56,76,89,100,343,21,234,5};


        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
            else if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return largest;
        // return smallest
    }
}
class FindLargestSmallestNumber_Test_01{
    public static void main(String[] args) {

        FindLargestSmallestNumber_01 Test1 = new FindLargestSmallestNumber_01();
        System.out.println(Test1.FindLargestSmallestNumber_01());
    }
}