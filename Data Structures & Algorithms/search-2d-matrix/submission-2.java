
//starircase search effective for 2D matrixes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int matrixLength = matrix.length;
        int cols = matrix[0].length-1;
       

        while(row < matrixLength && cols >= 0)
        
        {
             int current =  matrix[row][cols];

            if(current == target){
                return true;
            }

            else if(current > target){
                cols--;
            }

            else{
                row++;
            }

        }

        return false;

    }
}
