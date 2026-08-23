class Solution {
    public int longestConsecutive(int[] nums) {
        
            Set<Integer> set = new HashSet<>();
            int result=0;

            for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
            }

            for(Integer num : set){

                if(!set.contains(num-1)){
                
                int currentNum = num;

                    int count=1;

                    while(set.contains(currentNum+1)){
                        currentNum++;
                        count++;
                    }
                
                result =  Math.max(result,count);

                }
            }

            return result;


    }
}
