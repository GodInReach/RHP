import java.util.*;
public class CoefficientStair{
    static int N,K;
    static void dfs(int i,int rem,List<Integer> v){
        if(i==N){
            if(rem%N==0){
                for(int x:v) System.out.print(x+" ");
                System.out.println(rem/N);
            }
            return;
        }
        for(int a=0;i*a<=rem;++a){
            v.add(a);
            dfs(i+1,rem-i*a,v);
            v.remove(v.size()-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        List<Integer> v=new ArrayList<>();
        dfs(1,K,v);
    }
}