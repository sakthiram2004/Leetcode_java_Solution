class Solution {
    public int largestAltitude(int[] gain) {
        int j=0;

        int r[]=new int[gain.length+1];
        r[0]=0;
        for(int i=0;i<gain.length;i++){
            r[j+1]=r[j]+gain[i];
            j++;
        }
        return Arrays.stream(r).max().getAsInt();
        
    }
}