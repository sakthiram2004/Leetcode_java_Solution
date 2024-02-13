class Solution {
    public int[] frequencySort(int[] nums) {
        int result[] = new int[nums.length];
        Map<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                a.put(nums[i],a.get(nums[i])+1);
            }
            else{
                a.put(nums[i],1);
            }
        }

        List<Integer> l = new ArrayList<>(a.keySet());
        Collections.sort(l,(x,y)->{
            if(a.get(x)== a.get(y)){
                return y-x;
            }
            else{
                return a.get(x)-a.get(y);
            }
        });
        int i=0;
        for(int j:l){
            for(int k=0;k<a.get(j);k++){
                result[i++]=j;
            }
        }
        return result;
    }
}