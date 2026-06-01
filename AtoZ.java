import java.util.Scanner;
class AtoZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int op = 0;
        for( int i = 0; i<inp.length(); i++){
            op=op | 1<<(inp.charAt(i)-'a');
        }
        System.out.println((op==(1<<26)-1)?"yes":"no");
    }
}
