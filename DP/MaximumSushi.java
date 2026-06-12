import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];
        for (int i = 0; i < n; i++) x[i] = sc.nextInt();
        for (int j = 0; j < m; j++) y[j] = sc.nextInt();
        Arrays.sort(x);
        Arrays.sort(y);
        int i = 0, j = 0, count = 0;
        while (i < n && j < m) {
            if (y[j] <= 2 * x[i]) {
                count++;
                i++;
                j++;
            } 
            else {
                i++;
            }
        }
        System.out.println(count);
    }
}
