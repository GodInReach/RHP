import java.util.*;
public class NotAllCovered{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] st = new int[m+1];
        int[] end = new int[m+1];
        int[] arr = new int[n+2];
        for(int i = 1; i<=m; i++){
            st[i]=sc.nextInt();
            end[i]=sc.nextInt();
        }
        for(int i = 1; i<=m; i++){
            arr[st[i]]++;
            arr[end[i]+1]--;
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<=n; i++){
            sum+=arr[i];
            if(min>sum){
                min=sum;
            }
        }
        System.out.println(min);
    }
}
