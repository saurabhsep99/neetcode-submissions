class Solution {
    public String minWindow(String s, String t) {

        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> have = new HashMap<>();

        int left = 0;
        int required   = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        String answer = "";

         for(int i = 0 ; i<t.length();i++){
                char c  =  t.charAt(i);
                need.put(c,need.getOrDefault(c,0)+1);
        }

        for(int right = 0 ; right<s.length();right++){
                 char d  =  s.charAt(right);
                 have.put(d,have.getOrDefault(d,0)+1);

                 if(have.get(d) <= need.getOrDefault(d,0)){
                    required--;
                 }

                 while(required==0){
                    
                    int windowLength = right-left+1;
                    if(windowLength < minLength){
                        minLength = windowLength;
                        start = left;
                    }
    
                    char currentLeftChar = s.charAt(left);
                    have.put(currentLeftChar,have.get(currentLeftChar)-1);

                    if(have.get(currentLeftChar) < need.getOrDefault(currentLeftChar,0)){
                    required++;

                 }
                    left++;

                    
                 }
        }


        if (minLength == Integer.MAX_VALUE) {
    return "";
}

return s.substring(start, start + minLength);
        
    }
}
