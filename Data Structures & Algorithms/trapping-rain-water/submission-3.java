class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int left =0;
        int right = n-1;
        int maxLeft=0;
        int maxRight = 0;
        int total = 0;

        //always total water is depend on lowest boundry of   left    and right 

        while(left < right){
            

            if(height[left] <= height[right]){
                
                    if(height[left] >= maxLeft){
                        maxLeft = height[left];
                    }
                    else{
                        total = total + maxLeft-height[left];
                    }
                    left++;
            }
            else{

                if(height[right] >= maxRight){
                    maxRight = height[right];

                }
                else{
                    total = total + maxRight-height[right];
                    }
                
                right--;   
            }
            
        }

        return total;

    }
    }


