class Solution {
    public List<Integer> majorityElement(int[] nums) {

        //Booyer more voting algorithm

        int candidate1=0;
        int candidate2=0;

        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==candidate1){
                count1++;
            }
            
            else if(nums[i]==candidate2){
                count2++;
            }

            else if(count1 == 0){
                candidate1=nums[i];
                count1=1;
            }

              else if(count2 == 0){
                candidate2=nums[i];
                count2=1;
            }

            //different algorithm

            else{
                    count1--;
                    count2--;
            }
        }

        //verify the existing is greater than n/3 or not

        count1=0;
        count2=0;

        int threshholdNum = (int) Math.floor(nums.length/3);

        for(int i=0;i<nums.length;i++){

            if(nums[i]==candidate1){
                count1++;
            }

             if(nums[i]==candidate2){
                count2++;
            }
        }

        List<Integer> list = new ArrayList<>();

        if(count1 > threshholdNum){
            list.add(candidate1);
        }

         if(count2 > threshholdNum){
            list.add(candidate2);
        }

            return list;
    }
}