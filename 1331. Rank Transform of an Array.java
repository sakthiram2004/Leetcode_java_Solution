class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,Integer> a=new TreeMap<>();
        for(int i:arr)
        a.put(i,0);
        int rank=1;
        for(Map.Entry<Integer,Integer> b:a.entrySet())
        {
            int v=b.getKey();
            a.put(v,rank++);
        }
        int r[]=new int[arr.length];
        int ind=0;
        for(int i:arr)
        r[ind++]=a.get(i);
        return r;
    }
}