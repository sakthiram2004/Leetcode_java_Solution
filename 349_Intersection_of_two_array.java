class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> a=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i=0;i<n1;i++)
        for(int j=0;j<n2;j++)
        {
            if(nums1[i]==nums2[j])
            a.add(nums1[i]);
        }
        int b[]=new int[a.size()];
        int h=0;
        for(Integer k:a)
        {
            b[h]=k;
            h++;
        }
        return b;



        
    }
}