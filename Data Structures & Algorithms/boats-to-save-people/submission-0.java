class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);

        int left = 0;
        int n = people.length;
        int right = n-1;
        int count = 0;

        while(left <= right){

                if(people[left] + people[right] <= limit){
                    left++;
                    right--;
                    count++;
                }
                else{
                    right--;
                    count++;
                }
        }

        return count;

    }
}