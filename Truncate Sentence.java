class Solution {
    public String truncateSentence(String s, int k) {
        String r="";
        String t[]=s.split(" ");
        for(int i=0;i<k;i++)
        r=r+" "+t[i];
        return r.trim();
        
        
    }
}