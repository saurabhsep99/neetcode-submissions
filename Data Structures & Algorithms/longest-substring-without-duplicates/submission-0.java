
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int j = 0; // left pointer

        for (int i = 0; i < s.length(); i++) { // right pointer
            char c = s.charAt(i);

            // Shrink window from the left until duplicate 'c' is removed
            while (set.contains(c)) {
                set.remove(s.charAt(j));
                j++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, i - j + 1);
        }

        return maxLen;
    }
}