import java.util.*;
class MaxSumNoAdjColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] dyn = new int[n];
        for(int i = 0; i<n; i++){
            dyn[i]=arr[i][0];
        }
        for(int j = 1; j<m; j++){
            int[] temp = new int[n];
            for(int i = 0; i<n; i++){
                int max = Integer.MIN_VALUE;
                for(int k = 0; k<n; k++){
                    if(k!=i && (dyn[k]+arr[i][j])>max){
                        max = dyn[k]+arr[i][j];
                    }
                }
                temp[i]=max;
            }
            dyn = temp;
        }
        int max = Integer.MIN_VALUE;
        for(int i : dyn){
            if(max<i){
                max = i;
            }
        }
        System.out.print(max);
    }
}
