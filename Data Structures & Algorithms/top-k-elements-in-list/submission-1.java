class Solution {
    public int[] topKFrequent(int[] nums, int k) {

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

     
     //sort the map

     List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

     list.sort((a,b)-> b.getValue()-a.getValue());

     int [] result= new int [k];

     for(int i=0;i<k;i++){
         
         result[i] =  list.get(i).getKey();
     }


     return result;



    }
}
