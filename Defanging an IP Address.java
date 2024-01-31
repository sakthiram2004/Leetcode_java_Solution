class Solution {
    public String defangIPaddr(String a) {
        String r="";
        for(char i:a.toCharArray())
        {
            if(i=='.')
            r=r+"[.]";
            else
            r=r+i;
        }
        return r;
        
    }
}