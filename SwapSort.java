import java.util.Scanner;

public class SwapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        String swap = "";
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int index = 0; index < arr.length; index++) {
            int min = index;
            for (int j = index + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != index) {
                int temp = arr[min];
                arr[min] = arr[index];
                arr[index] = temp;
                swap += "" + index + " " + min + "\n";
                k++;
            }
        }
        System.out.println(k);
        System.out.println(swap);
    }
}
