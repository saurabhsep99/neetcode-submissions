class Solution {
    public int maxProfit(int[] price) {
        

        int profit =0;

        for(int i=1;i<price.length;i++){
            
            if(price[i] > price[i-1]){
                profit =  profit + (price[i]-price[i-1]);
            }
     
        }

        return profit;
    }

}