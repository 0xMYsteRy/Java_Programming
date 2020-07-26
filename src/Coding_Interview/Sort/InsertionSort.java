package Coding_Interview.Sort;

/*
1.Set a marker for the sorted section after the first element
2.Repeat the following until unsorted section is empty
    - Selection the first unsorted element
    - Swap other elements to the right to create the correct postion and shift the correct element.
    - Advance the marker to the right element.
 */
public class InsertionSort {

    public int[] insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int value = arr[i];
            int j;
            // If we get smaller value than valueToSort then , we stop at that index.
            for ( j = i; j > 0 && arr[j - 1] > value; j--) {
                arr[j] = arr[j - 1];
            }

            // We will put valueToSort at that index
            arr[j] = value;
            System.out.print("Iteration "+(i)+": ");
            printArray(arr);
        }

        return arr;
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class InsertionSortTest{
    public static void main(String args[])
    {
        int  arr[]={100,20,15,30,5,75};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);

    }
}