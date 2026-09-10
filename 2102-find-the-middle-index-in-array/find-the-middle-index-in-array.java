class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSums=0;
        for(int i =0;i<nums.length;i++){
            totalSums += nums[i];
            
        }

        int leftSums=0;
        for(int i=0;i<nums.length;i++){
            int rightSums=totalSums-leftSums-nums[i];
            if(leftSums == rightSums){
                return i;
            }
            leftSums += nums[i];
        }
        return -1;

        
        
    }
}