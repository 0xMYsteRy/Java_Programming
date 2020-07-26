package Coding_Interview.Sort;

/*
1.Selection
2.Swapping
3.Counter shift.
 */
class SelectionSort {
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}

class SelectionSortTest{
    public static void main(String[] args) {
        int[] arr = {40,10,-30,45,39,32};
        SelectionSort selectionSort1 = new SelectionSort();

        selectionSort1.selectionSort(arr);

        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}