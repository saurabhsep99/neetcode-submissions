class Solution {
    public int mySqrt(int x) {
        
        int low = 0 , high = x, answer=0;
        

        while(low<=high){
            
            int mid =  low + (high-low)/2;
            long square = (long) mid*mid;

            if(x == square){
                return mid;
            }

            else if( x > square){
                answer = mid;
                low =  mid+1;
            }

            else{
                high=mid-1;
            }
            
        }

        return answer;

    }
}