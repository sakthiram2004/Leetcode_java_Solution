class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length-1;i++)
        for(int j=i+1;j<nums.length;j++){
            int n=(nums[i]-1)*(nums[j]-1);
            if(n>max)
            max=n;
        }
        return max;
    }
}