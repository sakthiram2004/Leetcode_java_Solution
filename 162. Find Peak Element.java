class Solution {
    public int findPeakElement(int[] nums) {
        int r=nums[0];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>r){
            r=nums[i]; k=i;}
                           
            }
        
        return k;
        
    }
}