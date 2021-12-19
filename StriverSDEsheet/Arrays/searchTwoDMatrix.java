package StriverSDEsheet.Arrays;

public class searchTwoDMatrix {
        public boolean searchMatrix(int[][] matrix, int target) {

            if(matrix.length == 0 ) return false;
            
            int r = matrix.length;
            int c = matrix[0].length;
            
            int lo = 0;
            int hi = (r*c)-1;
            
            while(lo<=hi){
                int mid = (lo + (hi-lo)/2);
                
                if(matrix[mid/c][mid%c] == target)
                    return true;
                else if(matrix[mid/c][mid%c] < target)
                    lo = mid+1;
                else
                    hi = mid-1;
            }
            
            return false;
        }

}

//Problem link : https://leetcode.com/problems/search-a-2d-matrix/
