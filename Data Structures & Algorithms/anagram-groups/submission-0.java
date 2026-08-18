class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            char[] chars =  strs[i].toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            
            if(!map.containsKey(key)){
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                map.put(key,value);
            }

            else{

                List<String> value = map.get(key);
                value.add(strs[i]);
                
                map.put(key,value);
            }

        }

        return new ArrayList<>(map.values());

       


}
    


}
