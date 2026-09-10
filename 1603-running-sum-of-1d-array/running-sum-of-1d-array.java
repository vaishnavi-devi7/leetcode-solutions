class Solution {
    public int[] runningSum(int[] nums) {
        int ps[]=new int[nums.length];
        ps[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ps[i]=nums[i]+ps[i-1];
        }  
        return ps;
    }
}