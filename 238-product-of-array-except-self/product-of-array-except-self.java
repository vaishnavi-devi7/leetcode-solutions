class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answers = new int[nums.length];
        int left = 1;
        for(int i =0;i<nums.length;i++){
            answers[i] =left;
            left *= nums[i];

        }
        int right = 1;
        for(int i = nums.length-1;i>=0;i--){
            answers[i] *= right;
            right *= nums[i];
        }
        return answers;
        
    }
}