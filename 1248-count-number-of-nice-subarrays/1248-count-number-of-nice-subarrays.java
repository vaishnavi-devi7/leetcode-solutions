class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] prefixCount = new int[nums.length + 1];
        prefixCount[0] = 1;

        int oddCount = 0;
        int total = 0;

        for (int num : nums) {
            oddCount += (num & 1); 
            
            if (oddCount >= k) {
                total += prefixCount[oddCount - k];
            }
            prefixCount[oddCount]++;
        }

        return total;
    }
}