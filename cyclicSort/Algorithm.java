package cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] nums = { 9,6,4,2,3,5,7,0,1 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        // outputs [1, 2, 3, 4, 5]
        System.out.println(missingNumber(nums));
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    /*
     * Cyclic sort is a sorting algorithm that is particularly useful for dealing
     * with problems where the numbers to be sorted fall within a specific range
     * and the range size is known. it has a time complexity of O(n)
     */
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i];
            if (arr[i]==arr.length) {
                i++;
                continue;
            }
            else if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j) {
                return j;
            }
        }
        return arr.length;
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> missing = new ArrayList<>();
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=(j+1)) {
                missing.add(j+1);
            }
        }
        return missing;
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=(j+1)) {
                return arr[j];
            }
        }
        return 0;

    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicate = new ArrayList<>();
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=(j+1)) {
                duplicate.add(arr[j]);
            }
        }
        return duplicate;
    }
    public int[] findErrorNums(int[] arr) {
        List<Integer> duplicate = new ArrayList<>();
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=(j+1)) {
                return new int[]{arr[j],j+1};
            }
        }
        return null;
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=(j+1)) {
                return j+1;
            }
        }
        return arr.length+1;
    }

    public static void moveZeroes(int[] nums) {
        int lastNonZero = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=0) {
                swap(nums, lastNonZero, index);
                lastNonZero++;
            }
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
