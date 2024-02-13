class Solution {
    public String firstPalindrome(String[] words) {
        for(String  i : words){
            String k=new StringBuilder(i).reverse().toString();
            if(k.equals(i)){
            return i;
            }
        }
        return "";
        
    }
}