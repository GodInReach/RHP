import java.util.*;

public class OnADiet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int h=sc.nextInt();
        int w=sc.nextInt();
        int k=sc.nextInt();

        String[] s=new String[h];
        int[] r_b=new int[h];
        int[] c_b=new int[w];
        int[] d=new int[h*w];
        Arrays.fill(d,-1);

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<h;i++){
            s[i]=sc.next();
            for(int j=0;j<w;j++){
                if(s[i].charAt(j)=='#'){
                    r_b[i]=1;
                    c_b[j]=1;
                }
            }
        }

        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(s[i].charAt(j)=='.'&&r_b[i]==0&&c_b[j]==0){
                    d[i*w+j]=0;
                    q.offer(i*w+j);
                }
            }
        }

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        int ans=0;

        while(!q.isEmpty()){
            int u=q.poll();
            int r=u/w;
            int c=u%w;

            if(d[u]<=k) ans++;

            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];

                if(nr>=0&&nr<h&&nc>=0&&nc<w){
                    int v=nr*w+nc;
                    if(s[nr].charAt(nc)=='.'&&d[v]==-1){
                        d[v]=d[u]+1;
                        q.offer(v);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}