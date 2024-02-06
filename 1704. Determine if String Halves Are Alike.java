class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String a="";
        String b="";
        for (int i=0;i<n/2;i++)
        a=a+s.charAt(i);
        for (int j=n/2;j<n;j++)
        b=b+s.charAt(j);

        int c1=0,c2=0;
        for (int i=0;i<n/2;i++)
        {
            if(a.charAt(i)=='a'|| a.charAt(i)=='e'|| a.charAt(i)=='i'|| a.charAt(i)=='o'|| a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U')
            c1++;
            if(b.charAt(i)=='a'|| b.charAt(i)=='e'|| b.charAt(i)=='i'|| b.charAt(i)=='o'|| b.charAt(i)=='u'||b.charAt(i)=='A'||b.charAt(i)=='E'||b.charAt(i)=='I'||b.charAt(i)=='O'||b.charAt(i)=='U')
            c2++;
            
        }
        return c1==c2;

        
    }
}