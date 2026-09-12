class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for (int i =0; i< nums.length;i++){
            sum+=nums[i];
            int needed = sum-goal;
            if (map.containsKey(needed)){
                count += map.get(needed);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}