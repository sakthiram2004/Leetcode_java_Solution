class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;

        List<Boolean> r = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
             int max = Arrays.stream(candies).max().orElseThrow();

            if((candies[i]+extraCandies ) >=max  )
            r.add(true);
            else
            r.add(false);
        }
        return r;
        
    }
}