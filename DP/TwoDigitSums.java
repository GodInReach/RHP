import java.util.*;

public class TwoDigitSums {
    public static int lcs(String str1, String str2) {
        int[][] arr = new int[str1.length()+1][str2.length()+1];
        for(int i = 1; i<=str1.length(); i++){
            for(int j = 1; j<=str2.length(); j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return(arr[str1.length()][str2.length()]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int z = 0; z<n; z++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb1.append(s1.charAt(0));
            sb2.append(s2.charAt(0));
            for(int i = 1; i<s1.length(); i++){
                sb1.append(((sb1.charAt(i-1)-'0')+(s1.charAt(i)-'0'))%10);
            }
            for(int i = 1; i<s2.length(); i++){
                sb2.append(((sb2.charAt(i-1)-'0')+(s2.charAt(i)-'0'))%10);
            }
            System.out.println(lcs(sb1.toString(),sb2.toString()));
        }
    }
}
