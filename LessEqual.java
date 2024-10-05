import java.util.Scanner;

public class LessEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length-1);
        if (k==0) {
            System.out.println((arr[0]-1)!=0 ? (arr[0]-1):-1);
        }
        else if(k==n){
            System.out.println(arr[k-1]);
        }
        else if (arr[k-1]<arr[k]) {
            System.out.println(arr[k-1]);
        } else {
            System.out.println(-1);
        }
    }
    private static void mergeSort(int[] nums, int l, int h) {
        if (l==h) {
            return;
        }
        int mid = (l+h)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, h);
        merge(nums,l,mid,h);
    }
    private static void merge(int[] nums, int l, int mid, int h) {
        int leftIndex = l;
        int rightIndex = mid + 1;
    
        int rightArraySize = h-mid;
        int leftArraySize = mid - l + 1;
    
        int[] arr = new int[h-l+1];
        int index = 0;
        while (leftArraySize>0 && rightArraySize>0) {
            if (nums[leftIndex] < nums[rightIndex]) {
                arr[index] = nums[leftIndex];
                index++;
                leftArraySize--;
                leftIndex++;
            } else {
                arr[index] = nums[rightIndex];
                index++;
                rightArraySize--;
                rightIndex++;
            }
        }
    
        while (leftArraySize > 0) {
            arr[index] = nums[leftIndex];
            index++;
            leftArraySize--;
            leftIndex++;
        }
        while (rightArraySize > 0) {
            arr[index] = nums[rightIndex];
            index++;
            rightArraySize--;
            rightIndex++;
        }
    
        for (int j = l, i = 0; j <= h && i<arr.length; j++,i++) {
            nums[j] = arr[i];
        }
    }
}