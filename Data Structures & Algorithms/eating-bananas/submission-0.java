class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int high = Arrays.stream(piles)
                         .max()
                         .getAsInt();

        //find maxSpeed
        // then generate 0...maxSpeed

        int low = 1;
        int lowestSpeed = 0;

        while(low <= high){
            int mid = low + (high-low)/2;
            int calculateTime=0;

          long speed = Arrays.stream(piles)
    .mapToLong(value -> (long) Math.ceil((double) value / mid))
    .sum();

            if(speed <= h){
                lowestSpeed =mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }

        return lowestSpeed;

    }
}
