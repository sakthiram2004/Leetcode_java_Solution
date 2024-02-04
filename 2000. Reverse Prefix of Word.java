class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.indexOf(ch);
        if (n == -1)
            return word;
        StringBuilder r = new StringBuilder(word.substring(0, n+1)).reverse();
        return r.toString() + word.substring(n+1);
    }
}