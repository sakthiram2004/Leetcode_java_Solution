class Solution {
    public int[] runningSum(int[] nums) {
        int s=0,j=0;
        int r[]=new int[nums.length];
        for(int i : nums)
        {
        s=s+i;
        r[j++]=s;
        }
        return r;
        
    }
}