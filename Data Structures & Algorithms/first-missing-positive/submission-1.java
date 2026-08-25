class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;



        //check 1 exists its smallest posititive


        boolean hasOne = false;

        for(int num : nums){
            if(num==1){
                hasOne = true;
            }
        }

        if(!hasOne){
            return 1;
        }

        //make -ve and greater that number irrelevant because we can find first positive in (i..n)

        for(int i=0;i<nums.length;i++){

            if(nums[i] > n || nums[i] <=0){
                nums[i]=1;
            }
        }

        //mark encountered number

        for(int i=0;i<n;i++){  
                int num =  Math.abs(nums[i]);
                nums[num-1] = -Math.abs(nums[num-1]);
        }

        for(int i=0;i<n;i++){
            if(nums[i] > 0)
            {
                return i+1;
            }
        }

        return n+1;
        
    }
}