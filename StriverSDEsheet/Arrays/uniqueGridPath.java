package StriverSDEsheet.Arrays;

public class uniqueGridPath {
    public int uniquePaths(int m, int n) {
        int N = m+n-2; // Total number of steps to reach bottom right corner
        int r = m-1;
        double res = 1.0;
        
        for(int i=1;i<=r;i++){
            res = res*(N-r+i)/i;
        }
        
        return (int)res;
    }
}

//Problem link : https://leetcode.com/problems/unique-paths/
