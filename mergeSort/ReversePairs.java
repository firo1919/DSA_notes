class Solution {
    public static int countn;
    public static int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return countn;
    }
    public static void main(String[] args) {
        int[] arr = { 2,4,3,5,1 };
        System.out.println("result: "+reversePairs(arr));
    }
    public static void mergeSort(int[] nums, int l, int h){
        if(l==h) return;
        int mid = (l+h)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,h);
        countn += revPairs(nums,l,h,mid);
        merge(nums,l,h,mid);
    }

    public static void merge(int[] arr, int l, int h, int mid){
        int leftIndex = l;
        int rightIndex = mid+1;

        int leftArraySize = mid-l+1;
        int rightArraySize = h-mid;

        int index = 0;
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
        int i = 0;
        for (int n = l; n <= h; n++) {
            arr[n] = newArray[i];
            i++;
        }
    }    
    public static int revPairs(int[] arr, int l, int h, int mid){
        int count = 0;
        int rightIndex = mid+1;
        for (int i = l;i<=mid ;i++ ) {
            while(rightIndex <=h && arr[i] > 2*arr[rightIndex]) rightIndex++;
            count += (rightIndex -(mid+1));
        }
        
        return count;
    }

}