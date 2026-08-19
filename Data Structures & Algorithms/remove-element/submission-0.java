class Solution {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right =  nums.length-1;
       
       while(left <= right){

            // two pointer approach if found value from left shrink   the right boundry to find non val element so that left only has non value ele

        if(nums[left] != val){
            left++;
       }
            else{
                int temp = nums[left];
                nums[left] =  nums[right];
                nums[right] =  temp;

                right--;
            }

       } 

       return left;
        
    }
}