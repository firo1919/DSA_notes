
import java.util.Scanner;
import java.util.Arrays;

public class SumOfNeighbours {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[n-3]+arr[n-2] > arr[n-1]) {
            System.out.println("YES");
            int temp = arr[n-2];
            arr[n-2] = arr[n-1];
            arr[n-1] = temp;
            for (int e : arr) {
                System.out.print(e+" ");
            };
        } else {
            System.out.println("NO");
        }
    }
}