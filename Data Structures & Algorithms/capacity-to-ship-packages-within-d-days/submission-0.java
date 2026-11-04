class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int high =  Arrays.stream(weights).sum();
        int low = Arrays.stream(weights).max().getAsInt(); 
        
        int result = high; 

    
        while(low <= high) {
            int mid = low+(high-low)/2;

            if(canShip(weights,days,mid)){
                result = Math.min(result,mid);
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
      return result;
    }

    public boolean canShip(int[] weights,int days , int        capacity){
            int daysRequired=1; 
            int currentWeightSum=0;

            for(int i=0;i<weights.length;i++){
                if(weights[i]+currentWeightSum > capacity){
                    daysRequired++;
                    currentWeightSum=0;
                }
                currentWeightSum=currentWeightSum+weights[i];

            }

                return daysRequired <= days;
    }
}