import java.util.*;

public class DivisibleSubarray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int s = 0;
        int c = 0;

        Set<Integer> v = new HashSet<>();
        v.add(0);

        while(n-- > 0)
        {
            int a = sc.nextInt();

            s = (s + a) % k;

            if(v.contains(s))
            {
                c++;

                v.clear();
                v.add(s);
            }
            else
            {
                v.add(s);
            }
        }

        System.out.println(c);
    }
}