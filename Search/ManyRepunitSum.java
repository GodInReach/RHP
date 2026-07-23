import java.util.*;
public class ManyRepunitSum {
    int lowerboundlen(int x, int[] arr){
        int l = 0;
        int r = arr.length-1;
        int mid = l+(r-l)/2;
        int op = 0;
        while(l<r){
            if(arr[mid]==x){
                return arr.length-mid;
            }
            else if(arr[mid]>x){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        long carry = 0;
        int max = arr[arr.length-1];
        for(int i = 1; i<max; i++){
            
        }
    }
}
