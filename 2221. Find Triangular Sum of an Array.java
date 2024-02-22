class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        while(n!=1){
            for(int i=0;i<n-1;i++){
                int k =nums[i]+nums[i+1];
                if(k >= 10){
                    nums[i]= k-10;
                }
                else
                nums[i]=k;
            }
            n--;
        }
        return nums[0];
        
    }
}