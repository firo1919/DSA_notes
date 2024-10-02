package mergeSort;

public class Solution {
    public static int countn;
    public static int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return countn;
    }
    public static void main(String[] args) {
        int[] arr = { 1,3,2,3,1};
        System.out.println("result: "+reversePairs(arr)+"pairs");
    }
    public static void mergeSort(int[] nums, int l, int h){
        if(l==h) return;
        int mid = (l+h)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,h);
        countn += revPairs(nums,l,h,mid);
    }

    public static int revPairs(int[] arr, int l, int h, int mid){
        int count = 0;
        
        for (int i = l;i<=mid ;i++ ) {
            int rightIndex = mid+1;
            while(rightIndex <=h){
                if (arr[i] > 2*arr[rightIndex]) {
                    System.out.println(i+"  "+rightIndex);
                    count++;
                }
                rightIndex++;
            } 
            
        }
        
        return count;
    }

}