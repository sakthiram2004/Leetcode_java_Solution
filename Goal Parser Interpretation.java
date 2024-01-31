class Solution {
    public String interpret(String c) {
        c=c.replace("(al)","al");
        c=c.replace("()","o");
        return c;
        
        
    }
}