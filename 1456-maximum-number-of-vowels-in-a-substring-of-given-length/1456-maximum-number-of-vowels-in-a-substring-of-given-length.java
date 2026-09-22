class Solution {
    public int maxVowels(String s, int k) {
        int count = 0; 
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) count++;
            if (i >= k && isVowel(s.charAt(i - k))) count--;
            max = Math.max(max, count);
            if (max == k) return max;
        }
        return max;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}