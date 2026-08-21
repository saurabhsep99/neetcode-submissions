class Solution {
    public void sortColors(int[] nums) {
        
        quickSort(nums,0,nums.length-1);
       
    }

    public void quickSort(int [] nums , int low , int high){

        if(low<high){

            int partitionIndex = partition(nums , low , high);
            quickSort(nums ,low , partitionIndex-1);
            quickSort(nums ,partitionIndex+1 , high);

        }
    }

    private int partition(int [] nums , int low , int high){

        int i = low-1;
        int pivot = nums[high];

        for(int j=low;j<high;j++) {

            if(nums[j] < pivot) {
                i++;
            
            int temp = nums[i] ;
            nums[i]=nums[j];
            nums[j]=temp;

            }
        }

        //put pivot in middle
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

     return i+1;

    }

}