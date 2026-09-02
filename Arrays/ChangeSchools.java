import java.util.*;
public class ChangeSchools{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=0,ans=0;

        int[] c=new int[k+1];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            c[a]++;
            m=Math.max(m,c[a]);
        }
        for(int i=1;i<=k;i++){
            if(c[i]>=m-1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}