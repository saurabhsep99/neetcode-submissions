class Solution {
    public int characterReplacement(String s, int k) {
        
        int [] count = new int[26];
        int left =0;
        int maxLen = 0;
        int maxFrequency =0;


        for(int right = 0 ; right <s.length();right++){


         //update the frequency
          count[s.charAt(right)-'A']++;

          // find the most occured ele in window

            maxFrequency  =  Math.max(maxFrequency ,count[s.charAt(right)-  'A'] );
            int windowSize = right - left+1;

            int replacementRequired = windowSize-maxFrequency;

            //shrink the  window
            if(replacementRequired > k){
                count[s.charAt(left)-'A']--;
                left++;
                
            }

                //return maxlength
            maxLen = Math.max(maxLen,right-left+1);

        }

        return maxLen;
    }
}
