package mergeSort;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 6, 5, 4 };
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        // outputs [4, 4, 5, 5, 6, 6, 7, 8]
    }

    /*
     * merge sort algorithm is a divide and merge algorithm where we divide the
     * array into sub array and sort them as we go up, it uses a recursive
     * function.
     */
    private static void mergeSort(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        mergeSortAlgo(arr, l, h);
    }

    private static void mergeSortAlgo(int[] arr, int l, int h) {
        if (l == h)
            return;
        int mid = (l + h) / 2;
        mergeSortAlgo(arr, l, mid);
        mergeSortAlgo(arr, mid + 1, h);
        merge(arr, l, h, mid);
    }

    private static void merge(int[] arr, int l, int h, int mid) {
        // starting indexes for both right and left arrays
        int leftIndex = l;
        int rightIndex = mid + 1;
        // arrays sizes for looping through the arrays
        int leftArraySize = mid - l + 1;
        int rightArraySize = h - mid;

        int index = 0;// an index tracker for the new array
        int[] newArray = new int[h - l + 1];
        while (leftArraySize > 0 && rightArraySize > 0) {
            if (arr[leftIndex] <= arr[rightIndex]) {
                newArray[index] = arr[leftIndex];
                index++;
                leftIndex++;
                leftArraySize--;
            } else {
                newArray[index] = arr[rightIndex];
                index++;
                rightIndex++;
                rightArraySize--;
            }
        }
        // filling out left values from both arrays to the new array
        while (leftArraySize > 0) {
            newArray[index] = arr[leftIndex];
            index++;
            leftIndex++;
            leftArraySize--;
        }
        while (rightArraySize > 0) {
            newArray[index] = arr[rightIndex];
            index++;
            rightIndex++;
            rightArraySize--;
        }
        // replacing the old array with the new sorted array
        int i = 0;
        for (int n = l; n <= h; n++) {
            arr[n] = newArray[i];
            i++;
        }
    }
}
