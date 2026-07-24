import java.util.*;

public class TallestAtTheMoment
{
    static int upperbound(List<Integer> arr, int target)
    {
        int left = 0, right = arr.size();

        while(left < right)
        {
            int mid = left + (right - left) / 2;
            if(arr.get(mid) > target)  right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        int maxHeight = 0;
        for(int i = 0; i < n; i++)
        {
            int currHeight = sc.nextInt();
            int currTime = sc.nextInt();

            map.put(currHeight, currTime);
        }

        List<Integer> heights = new ArrayList<>();
        List<Integer> time = new ArrayList<>();

        int till = 0;
        int i=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value <= till) continue;
            till = value;
            heights.add(key);
            time.add(value);
        }
        int q = sc.nextInt();
        while(q-- > 0)
        {
            int ub = upperbound(time,sc.nextInt());
            System.out.println(heights.get(ub));
        }
    }
}
