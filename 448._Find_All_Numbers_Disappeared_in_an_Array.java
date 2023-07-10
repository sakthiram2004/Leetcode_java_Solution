class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n=nums.length;
       List <Integer> a=new ArrayList<>();
       HashSet <Integer> b=new HashSet<>();
       List <Integer> c=new ArrayList<>();

       for(int i:nums)
       b.add(i);
       for(int i=1;i<=n;i++)
       if(!(b.contains(i)))
       a.add(i);
       for(int i:a)
       c.add(i);
       return c;


       
      

        
    }
}