class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int f=0;
        for(int i=0;i<=n;i++)
        for(int j=i+1;j<n;j++)
        {
            if(s.charAt(i)==s.charAt(j))
                f=1;
            if(f==0 && i==n-1)
            return i;
            
        }
        return -1;
    
    }
}