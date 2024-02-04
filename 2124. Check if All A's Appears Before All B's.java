class Solution {
    public boolean checkString(String s) {
        char a[]=s.toCharArray();
        char b[]=s.toCharArray();
        Arrays.sort(b);
        for(int i=0;i<a.length;i++)
        if(a[i]!=b[i])
        return false;
        return true;
        
        
    }
}