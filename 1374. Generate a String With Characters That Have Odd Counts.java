class Solution {
    public String generateTheString(int n) {
        String r="";
        if(n%2==0){
            for(int i=1;i<=n-1;i++)
            r=r+'p';
            r=r+'q';
        }
        else
        {
            for(int i=1;i<=n;i++)
            r=r+'x';
        }
        return r;

        
    }
}