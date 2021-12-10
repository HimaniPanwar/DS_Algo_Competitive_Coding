package ArraysAndVectors;

public class MaximumSubArraySum {

        public int maxSubarraySum(int[] arr){
            
            int n = arr.length;
            int curr_sum = 0, max_sum = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++){
                
                curr_sum += arr[i];
                
                //If sum is negative at any point of time then make it 0
                curr_sum = Math.max(curr_sum,0);
                
                max_sum = Math.max(max_sum,curr_sum);
            }
            
            return max_sum;
        }
}

// Link to Leetcode Problem -> https://leetcode.com/problems/maximum-subarray/
