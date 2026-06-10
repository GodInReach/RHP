import java.util.*;
class LargestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int max = Integer.MIN_VALUE;
        int[][] arr = new int[str1.length()+1][str2.length()+1];
        for(int i = 1; i<=str1.length(); i++){
            for(int j = 1; j<=str2.length(); j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                    max=Math.max(max,arr[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}
