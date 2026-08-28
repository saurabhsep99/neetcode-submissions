class Solution {
    public void merge(int[] nums, int m, int[] nums2, int n) {

            int leftPointer = m-1;
            int rightPointer = n-1;

            int writePointer = m+n-1;

            while(leftPointer>=0 && rightPointer >=0){

                if(nums[leftPointer] >= nums2[rightPointer]){

                        nums[writePointer] = nums[leftPointer];
                        leftPointer--;
                        writePointer--;

                }
                else{   
                        nums[writePointer] = nums2[rightPointer]; 
                        writePointer--;
                        rightPointer--;

                }
            }

            //if n still has elements

                while(rightPointer >= 0){
                    nums[writePointer] =  nums2[rightPointer];
                    writePointer--;
                    rightPointer--;

                }

    }


}