package StriverSDEsheet.Arrays;

public class maximumSubArray {
        public int maxSubArray(int[] nums) {
            int currSum = 0,maxSum = nums[0];
            
            for(int i=0;i<nums.length;i++){
                currSum += nums[i];
                
                if(currSum < nums[i]){
                    currSum = nums[i];
                }
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            
            return maxSum;
        }
}

//Problem link : https://leetcode.com/problems/maximum-subarray/
