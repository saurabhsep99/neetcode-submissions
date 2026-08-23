class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

                if(map.containsKey(nums[i])){
                    int value =  map.get(nums[i]);
                    map.put(nums[i],value+1);
                }
                else{
                    map.put(nums[i],1);
                }
        }

        List<Integer> list =  new ArrayList<>();

        int majorityNum = (int) Math.floor(nums.length/3);
        for(Map.Entry<Integer,Integer> entry :  map.entrySet()){

            if(entry.getValue() > majorityNum){

                    int resultele = entry.getKey();
                    list.add(resultele);
            }
        }

        return list;

    }
}