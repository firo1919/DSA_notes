import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
 
}
public static int[] sortArray(int[] nums){
    mergeSort(nums, 0, nums.length-1);
    return nums;
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
public static int maxCoins(int[] piles) {
    Arrays.sort(piles);
    Deque<Integer> queue = new ArrayDeque<>( );
    for (int num : piles) {
        queue.addLast(num);
    }
    
    int ans = 0;
    while (!queue.isEmpty()) {
        queue.removeLast();
        ans += queue.removeLast();
        queue.removeFirst();
    }
    
    return ans;
}
public void sortColors(int[] nums) {
      int[]  arr = new int[3];
      for (int n : nums) {
        arr[n]++;
      }

      int i = 0;
      for (int index = 0; index < arr.length; index++) {
        while (arr[index]>0) {
            nums[i]=index;
            i++;
            arr[index]--;
        }
      }
}

}
