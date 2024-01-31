class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        int c=0;
        for(String i:s)
        {
            c=i.split(" ").length;
            if(max<c)
            max=c;
        }
        return max;
        
    }
}