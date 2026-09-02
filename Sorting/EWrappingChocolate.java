import java.util.*;

public class EWrappingChocolate{
    static class Pair{
        int w,h;
        Pair(int w,int h){
            this.w=w;
            this.h=h;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        Pair[] chocolate=new Pair[n];
        Pair[] box=new Pair[m];

        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[m];
        int[] d=new int[m];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) b[i]=sc.nextInt();
        for(int i=0;i<m;i++) c[i]=sc.nextInt();
        for(int i=0;i<m;i++) d[i]=sc.nextInt();

        for(int i=0;i<n;i++) chocolate[i]=new Pair(a[i],b[i]);
        for(int i=0;i<m;i++) box[i]=new Pair(c[i],d[i]);

        Arrays.sort(chocolate,(x,y)->x.w!=y.w?y.w-x.w:y.h-x.h);
        Arrays.sort(box,(x,y)->x.w!=y.w?y.w-x.w:y.h-x.h);

        TreeMap<Integer,Integer> map=new TreeMap<>();
        int j=0;
        for(Pair ch:chocolate){
            while(j<m&&box[j].w>=ch.w){
                map.put(box[j].h,map.getOrDefault(box[j].h,0)+1);
                j++;
            }
            Integer key=map.ceilingKey(ch.h);
            if(key==null){
                System.out.println("No");
                return;
            }
            int cnt=map.get(key);
            if(cnt==1) map.remove(key);
            else map.put(key,cnt-1);
        }
        System.out.println("Yes");
    }
}