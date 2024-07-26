package countSort;

import java.util.Arrays;

public class Algorithm{
    public static void main(String[] args) {
        
    }
    public static void countSort(int[] arr){
		int max = Arrays.stream(arr).max().getAsInt();
		int[] countArr = new int[max+1];
		for (int element : arr) {
			countArr[element]++;
		}
		int index = 0;
		for (int i = 0; i < countArr.length; i++) {
			while(countArr[i]>0){
				arr[index] = i;
				index++;
				countArr[i]--;
			}
		}
	}
}
