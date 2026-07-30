import java.util.*;
public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int pos = n-1;
        for(int i = 0; i<q; i++){
            int a = sc.nextInt();
            int b = (sc.nextInt()%n);
            if(a==1){
                pos-=b;
                if(pos<0){
                    pos+=n;
                }
            }
            else if(a==2){
                System.out.println(s.charAt((pos+b)%n));
            }
        }
    }
}


