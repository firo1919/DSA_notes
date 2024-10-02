package countSort;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 6, 5, 4 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));
        // outputs [4, 4, 5, 5, 6, 6, 7, 8]
    }

    /*
     * Counting Sort is a non-comparison-based sorting algorithm that sorts the
     * elements based on the frequency of the elements in the array. it has an
     * overall time complexity of O(n+k) where n is the number of elements in the
     * array and k is the range of the elements in the array.
     */
    public static void countSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] countArr = new int[max + 1];
        for (int element : arr) {
            countArr[element]++;
        }
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }
}
