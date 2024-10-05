import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            List<int[]> packages = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                sc.nextLine();
                packages.add(new int[]{x,y});
            }
            Collections.sort(packages, (a, b) ->{
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            } );

            int curX = 0, curY = 0;
            boolean isValid = true;
            StringBuilder path = new StringBuilder();

            for (int[] pkg : packages) {
                if (pkg[0]<curX || pkg[1]<curY) {
                    isValid = false;
                    break;
                }

                while (curX < pkg[0]) {
                    path.append("R");
                    curX++;
                }

                while (curY < pkg[1]) {
                    path.append("U");
                    curY++;
                }
            }
            if (isValid) {
                System.out.println("YES");
                System.out.println(path.toString());
            } else {
                System.out.println("NO");
            }
        }
    }
}
