class Solution {
    public int alternateDigitSum(int n) {
        String s=""+n;
        int r=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            r=r+(s.charAt(i)-'0');
            else if(i%2 != 0)
            r=r-(s.charAt(i)-'0');
            else if(i%2==0)
            r=r+(s.charAt(i)-'0');

        }
        return r;
        
        
    }
}