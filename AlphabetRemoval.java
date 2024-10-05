import java.util.Scanner;
public class AlphabetRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String ss = sc.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < arr.length && k > 0; i++) {
            char currentChar = (char)('a'+ i);

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (currentChar == ss.charAt(j)) {
                    count++;
                }
            }
            if (count<=k) {
                arr[i] = count;
                k-=count;
            } else {
                arr[i] = k;
                k = 0;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char currentChar = ss.charAt(i);
            int index = currentChar - 'a';
            
            if (arr[index] > 0) {
                arr[index]--; 
            } else {
                result.append(currentChar); 
            }
        }
        System.out.println(result.toString());
    }
}
