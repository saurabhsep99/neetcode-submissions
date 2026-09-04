class Solution {
    public int lengthOfLongestSubstring(String s) {

            Set<Character> set = new HashSet<>();
            int maxLen = 0;
            int j=0;

            for(int i=0;i<s.length();i++){

                char c = s.charAt(i);
               

                while(set.contains(c)){
                    char d = s.charAt(j);
                    set.remove(d);
                    j++;
                }

                set.add(c);
                maxLen = Math.max(maxLen,i-j+1);

            }
            return maxLen;
    }
}
