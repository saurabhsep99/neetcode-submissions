class Solution {
    public boolean isAnagram(String s, String t) {

       

        char [] charArray1 =  s.toCharArray();
        char [] charArray2 =  t.toCharArray();

     if(charArray1.length != charArray1.length){
            return false;
        }


        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        String s1 =  new String(charArray1);
        String s2 =  new String(charArray2);

      if(!s1.equals(s2)){
        return false;
      }

        return true;

    }
}
