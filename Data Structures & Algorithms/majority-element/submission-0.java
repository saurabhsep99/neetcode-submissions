class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 1;
        int lastCount = 0;
        int majorityNumber = nums[0];


        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){

                if(nums[i]!= nums[i+1]){

                    lastCount=count;
                    count=1;
                }

                else{
                    count++;
                }

                 if(count > lastCount){
                            majorityNumber = nums[i];
                        }

                
        }

        return majorityNumber;

    }
}