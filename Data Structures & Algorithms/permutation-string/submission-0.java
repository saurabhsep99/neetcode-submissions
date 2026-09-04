class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
            char [] first  = s1.toCharArray();
         
            Arrays.sort(first);

        for(int i=0; i <= s2.length() - s1.length();i++){
             String sub = s2.substring(i,i+s1.length());
            char [] sortedSub = sub.toCharArray();
            Arrays.sort(sortedSub);
            

            if(Arrays.equals(first,sortedSub)){
                return true;
            }
 

        }

        return false;


    }
}
