import java.util.*;
class MaxSumNoAdj {
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
        int[] dyn = arr[0].clone();
        for(int i = 1; i<n; i++){
            int[] temp = new int[m];
            for(int j = 0; j<m; j++){
                int max = Integer.MIN_VALUE;
                for(int k = 0; k<m; k++){
                    if(k!=j && (dyn[k]+arr[i][j])>max){
                        max = dyn[k]+arr[i][j];
                    }
                }
                temp[j]=max;
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
