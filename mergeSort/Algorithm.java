package mergeSort;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,6,5,4};
        mergeSort(arr, 8);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int length) {
        mergeSortAlgo(arr, 0, length - 1);
    }

    public static void mergeSortAlgo(int[] arr, int l, int h) {
        if(l == h) return;
        int mid = (l + h) / 2;
        mergeSortAlgo(arr, l, mid);
        mergeSortAlgo(arr, mid + 1, h);
        merge(arr, l, h, mid);
    }

    public static void merge(int[] arr, int l, int h, int mid) {
        int k = l;
        int m = mid + 1;

        int i = mid - l + 1;
        int j = h - mid;

        int index = 0;
        int[] answer = new int[h - l + 1];
        
        while (i > 0 && j > 0) {
            if (arr[k] <= arr[m]) {
                answer[index] = arr[k];
                i--;
                k++;
                index++;
            } else {
                answer[index] = arr[m];
                j--;
                m++;
                index++;
            }
        }

        while (i > 0) {
            answer[index] = arr[k];
            k++;
            i--;
            index++;
        }
        while(j>0){
            answer[index] = arr[m];
            m++;
            j--;
            index++;
        }

        int g = 0;
        for (int n = l; n <= h; n++) {
            arr[n] = answer[g];
            g++;
        }

    }

}
