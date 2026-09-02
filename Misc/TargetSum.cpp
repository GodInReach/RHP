public class TargetSum {
public:
    int findTargetSumWays(vector<int>& nums, int target) {
        int N=nums.size();
        vector<int>curr={0};
        for(int i=0;i<N;i++){
            vector<int>newlist(curr.size()*2);
            int si=0;
            for(int val:curr){
                newlist[si++]=val+nums[i];
                newlist[si++]=val-nums[i];
            }
            curr=newlist;
        }
        int count=0;
        for(int val:curr){
            count+=(val==target);
        }
        return count;
    }
};