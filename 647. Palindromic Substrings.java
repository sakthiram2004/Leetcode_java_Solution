class Solution {
    public int countSubstrings(String s) {
        int c=s.length();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                String p=s.substring(i,j+1);
                String pr = new StringBuilder(p).reverse().toString();
                if(p.equals(pr)){
                    c++;
                }
            }
        }
        return c;
        
    }
}