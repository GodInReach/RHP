class Solution {
    public int maxRotateFunction(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        long sum = 0;
        long fn = 0;
        long mx = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            fn+=i*nums[i];
        }
        mx=fn;
        for(int i = nums.length-1; i>0; i--){
            long temp = fn-(nums[i]*(nums.length-1))+(sum-nums[i]);
            fn=temp;
            mx = Math.max(mx, temp);
        }
        return (int)mx;

    }
}