package Fundamental.Chapter7;

public class LinearSearch {
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}

/*
Since the execution time of a linear search increases linearly
as the number of array elements increases, linear search is inefficient for a large array.
 */