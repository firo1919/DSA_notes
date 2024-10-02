package insertionSort;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 6, 5, 4 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        // outputs [4, 4, 5, 5, 6, 6, 7, 8]
    }

    /*
     * an insertion sort is an O(n^2) sorting algorithm,
     * it treats a portion of an array as sorted and places each value from the
     * unsorted part into the sorted portion.
     */
    public static void insertionSort(int[] arr) {
        // starts from index 1 treating index 0 as sorted
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
