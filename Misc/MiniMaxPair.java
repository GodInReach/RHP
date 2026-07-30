import java.util.*;
public class MinMaxPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i<=n; i++){
            arr[i]=sc.nextInt();
        }
        int i = 1;
        int x = 1;
        int count = 0;
        while(i<=n){
            int j = i+x;
            x++;
            if(j>n){
                i++;
                x=1;
                continue;
            }
            if((arr[i]==i || arr[j]==i) && (arr[i]==j || arr[j]==j)){
                count++;
            }
        }
        System.out.println(count);
    }
}


