import java.util.Scanner;
import java.util.Arrays;
public class Teams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int k = 0; k < arr.length; k+=2) {
            ans+=(arr[k+1]-arr[k]);
        }
        System.out.println(ans);
    }
}