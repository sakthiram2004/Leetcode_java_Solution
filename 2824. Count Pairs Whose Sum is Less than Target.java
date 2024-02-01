class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        Integer[] array = nums.toArray(new Integer[nums.size()]);
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i]+array[j] < target ))
                c++;
            }
        }
        return c;
    }
}