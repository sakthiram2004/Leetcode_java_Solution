class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> a= new ArrayList<>();
        String num="123456789";
        int l=(""+low).length();
        int h=(""+high).length();
        for(int i=l;i<=h;i++){
            for(int j=0;j<10-i;j++)
            {
                int n = Integer.parseInt(num.substring(j,j+i));
                if(n >= low && n <= high){
                    a.add(n);
                }
            }
        }

        return a;

        
    }
} 	