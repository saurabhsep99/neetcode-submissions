class Solution {
    public void reverseString(char[] s) {
  
        int middle = (int) Math.floor(s.length/2);
        
        for(int i=0;i<middle;i++){
            
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] =  temp;
        }
    }
}