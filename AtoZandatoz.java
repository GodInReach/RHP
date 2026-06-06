import java.util.*;
class AtoZandatoz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        long op = 0;
        for( int i = 0; i<inp.length(); i++){
            op=op | 1L<<(inp.charAt(i)-'A');
        }
        System.out.println(op==(((1L<<58)-1)^(((1L<<6)-1)<<26))?"yes":"no");
    }
}
