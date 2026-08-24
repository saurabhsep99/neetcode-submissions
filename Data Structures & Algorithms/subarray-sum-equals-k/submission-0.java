class Solution {
    public int subarraySum(int[] nums, int k) {
        
            //code using prefix sum

            Map<Integer,Integer> map = new HashMap<>();
            int prefixSum=0;
            int count=0;

            //add prefix sum =0 appeared once
            map.put(0,1);

            for(int i=0;i<nums.length;i++){

                prefixSum = prefixSum+nums[i];

                //formula to find value in prefix sum
                //Sum(L,R) = prefixSum[R]-prefixSum[L-1];
                //K = prefixSum[R]-prefixSum[L-1];
                //prefixSum[L-1] = prefixSum[R]-K;

                int requiredSum = prefixSum-k;

                if(map.containsKey(requiredSum)){
                    count= count+map.get(requiredSum);
                }

                map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
                
            }

            return count;


    }
}