class Solution {
    public int distributeCandies(int[] can) {
        Set <Integer> c = new HashSet<>();
        for(int i:can){
            c.add(i);
        }
        
        if(c.size() > can.length/2 )
            return can.length/2;
        return c.size();
        
    }
}