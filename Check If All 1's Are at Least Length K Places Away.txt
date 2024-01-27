class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==1 && (nums.length-(i+1) >= k || nums[i+1]!=0 ))
            {
                int n=i+k;
                for(int j=i+1;j<=n;j++)
                if(nums[j]==1)
                return false;
            }

        }
        return true;
    }
}
