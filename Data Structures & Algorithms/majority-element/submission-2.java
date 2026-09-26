class Solution {

    //voting method
    public int majorityElement(int[] nums) {

            int winningCandidate = 0;
            int votes=0;

            for(int i=0;i<nums.length;i++){

                if(votes==0){
                    winningCandidate = nums[i];
                    votes=1;
                }

                else if(nums[i]==winningCandidate){
                            votes++;  
                    }
                    else{
                        votes--;
                    }

                
            }

            return winningCandidate;
    }
}