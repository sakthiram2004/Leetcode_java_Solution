class Solution {
    public int findCenter(int[][] a) {
        int r=-1;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i+1][0]==a[i][a[i].length-1]){
                r=a[i+1][0];
                break;
            }

            
        }
        if(r==-1){
            r=a[a.length-1][a[a.length-1].length-1];
            return r;
        }
        return r;
        
    }
}