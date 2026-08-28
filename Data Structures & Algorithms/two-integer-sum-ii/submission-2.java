class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int first =0;
        int last = numbers.length-1;

        int [] num = new int[]{0,0};

        while(first < last){

            if(numbers[first] + numbers[last] == target){
                num[0] = first+1;
                num[1] = last+1;

                return num;
            }
            else if(numbers[first] + numbers[last] > target){
                last--;
            }

            else {
                 first++;
            }

        }

        return num;

    }
}
