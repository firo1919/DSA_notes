package cyclicSort;

public class Algorithm{
    public static void main(String[] args) {
        
    }
    public static void cyclicSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			while(!(arr[i]==(i+1))){
				swap(arr, i, arr[i]-1);
			}
		}
	}
    private static void swap(int[] arr, int j,int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
