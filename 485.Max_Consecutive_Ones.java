class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a[]=new int[nums.length];
        int c=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
            c++;
            else
            {
                a[j]=c;
                j++;
                c=0;
            }
        }
        if(c!=0)
        a[j]=c;
        
        int k=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(k<a[i])
            k=a[i];
        }
        return k;
        
    }
}