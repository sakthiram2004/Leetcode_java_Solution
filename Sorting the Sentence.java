class Solution {
    public String sortSentence(String s) {
        
        int c=0;
        String a[]=s.split(" ");
        int n=a.length;
        int j=1;
        String r="";
        while(c!=n){
            for(String k:a){
                if (k.contains(""+j)){
                    r=r+" "+k.replace(""+j,"");
                    c++;
                    j++;
                }
            }
        }
        return r.trim();
        
    }
    
}