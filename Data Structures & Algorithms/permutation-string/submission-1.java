class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int [] count1 = new int[26];
        int [] count2 =  new int[26];

        if(s1.length() > s2.length()){
                return false;
        }

        int windowSize = s1.length();

        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
        }

         for(int i=0;i<windowSize;i++){
            count2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(count1,count2)){
            return true;
        }


        for(int j=windowSize;j<s2.length();j++){
            
             count2[s2.charAt(j)-'a']++;
              int left = j-windowSize;
              
            count2[s2.charAt(left)-'a']--;

            if(Arrays.equals(count1,count2)){
                return true;
            }

        }

        return false;

    }
}
