class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        String s1="";
        String s2="";
        for(String i:w1)
        s1=s1+i;
        for(String i:w2)
        s2=s2+i;
        return s1.equals(s2);


        
    }
}