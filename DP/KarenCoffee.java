import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int maxx = 200002;
        int[] diff = new int[maxx];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            diff[start]++;
            diff[end + 1]--;
        }
        int[] prefix = new int[maxx];
        int coverage = 0;
        for(int i = 1 ; i <= 200000 ; i++) {
            coverage += diff[i];
            prefix[i] = prefix[i - 1] + (coverage >= k ? 1 : 0);
        }
        for(int i = 0 ; i < q ; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(start + "-" + end + " = " + (prefix[end] - prefix[start-1]));
        }
    }
}
