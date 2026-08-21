class Solution {

    public int[] sortArray(int[] nums) {
        
        quickSort(nums,0,nums.length-1);
        return nums;
    }


    public void quickSort(int[] nums, int low, int high){

        if(low < high){
             int partitionIndex =  partition(nums,low,high);
        quickSort(nums,low,partitionIndex-1);
        quickSort(nums,partitionIndex+1,high);
        }
       


    }

    public int partition(int[] nums, int low , int high){

        int pivot = nums[high];

            //lomuto partition
            //always point to lesser number that pivot
        int i = low-1;



        for(int j=low;j<high;j++){

                if(nums[j]<pivot){

                    //point lesser number than pivot
                    i++;

                //swap nums[i] and nums[j]
                // i always point to lesser number than pivot
                    int temp = nums[i];
                    nums[i]  = nums[j];
                    nums[j] = temp;
                }
        }

        //put pivot in correct place

        int temp =  nums[i+1];
        nums[i+1] =  nums[high];
        nums[high] = temp;

        return i+1;

    }


}