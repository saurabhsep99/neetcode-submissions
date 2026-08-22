class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] prefixArray =  new int[nums.length];
        int [] suffixArray =  new int[nums.length];
        int [] resultArray =  new int[nums.length];


        for(int i=0;i<nums.length;i++){
            prefixArray[i] = i>0 ? prefixArray[i-1] * nums[i-1] : 1;
        }

        for(int j=nums.length-1;j>=0;j--){

            suffixArray[j] = j<nums.length-1 ? suffixArray[j+1] * nums[j+1] :  1 ;
        }


   for(int k=0;k<nums.length;k++){

            resultArray[k] = suffixArray[k] * prefixArray[k];
        }

        return resultArray;




    }
}  
