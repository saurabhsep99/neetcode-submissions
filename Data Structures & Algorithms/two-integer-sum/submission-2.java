class Solution {
    public int[] twoSum(int[] nums, int target) {

      Map<Integer,Integer> map = new HashMap<>();

      for(int i=0;i<nums.length;i++){
            int requiredNum =  target-nums[i];

            if(map.containsKey(requiredNum)){
                int key = map.get(requiredNum);
                return new int[]{key,i} ;
            }
            else{
                map.put(nums[i],i);
            }
      } 

      return new int[0]; 
        
    }
}
