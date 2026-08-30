class Solution {
    public int trap(int[] height) {
        
        int n=height.length;

        int [] prefixMax= new int[n];
        int [] suffixMax =  new int[n];
        int maxLeft=height[0];
        int maxRight = height[n-1];
        int total=0;

        prefixMax[0] = height[0];
        suffixMax[n - 1] = height[n - 1];

        for(int i=1;i<=n-1;i++){

            maxLeft = Math.max(height[i],maxLeft);
            prefixMax[i] = maxLeft;
        }

       for(int i=n-2;i>=0;i--){

            maxRight = Math.max(height[i],maxRight);
            suffixMax[i] = maxRight;
        }

        for(int i=0;i<n;i++){
            
            int trappedWaterHeight = Math.min(suffixMax[i],prefixMax[i]);
            total = total+trappedWaterHeight - height[i];
        }

        return total;

    }
}
