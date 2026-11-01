class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int low = 0 ,  high = matrix.length-1;
        int cols = matrix[0].length;


        while(low <= high){

            int rowMid =  low+(high-low)/2;

            int first = matrix[rowMid][0]; 
            int last = matrix[rowMid][cols-1];          


           
            if(first <= target && target <= last){

                 int colLowest = 0;
                 int colHighest = matrix[rowMid].length-1;

                
                 while(colLowest <= colHighest){
                        int colMid = colLowest + (colHighest-colLowest)/2;
                        

                        if(matrix[rowMid][colMid]==target){
                            return true;
                        }

                        else if(target > matrix[rowMid][colMid]){
                               colLowest =colMid+1; 
                        }

                        else{
                            colHighest = colMid-1;
                        }
                 }

                
                
                return false;
            }

            

            else if (target > last){
                low=rowMid+1;
            }
            else{
                high =  rowMid-1;
            }

           

        }

        return false;

    }
}
