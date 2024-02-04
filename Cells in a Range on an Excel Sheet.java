class Solution {
    public List<String> cellsInRange(String s) {
        int r= Integer.parseInt(""+(s.charAt(1)));
        int c= Integer.parseInt(""+s.charAt(4));
        char n1=s.charAt(0);
        char n2=s.charAt(3);
        List<String> res=new ArrayList<>();
        for(char i=n1;i<=n2;i++)
        //for(int j = 1;j<=r;j++)
        for(int k=r;k<=c;k++)
        res.add(""+i+k);
        return res;

         
    }
}
