package StriverSDEsheet.Arrays;

// Program to sort an array of 0's,1's and 2's

public class SortArrayOfColor{
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        int low=0,mid=0,high=n-1,temp=0;
        
        while(mid<=high){
            
            switch(nums[mid]){
                case 0: temp = nums[mid];
                        nums[mid] = nums[low];
                        nums[low] = temp;
                        low++;
                        mid++;
                        break;
                
                case 1: mid++;
                        break;
                    
                case 2: temp = nums[high];
                        nums[high] = nums[mid];
                        nums[mid] = temp;
                        high--;
                        break;
            }
        }
    }
}

//Leetcode link : https://leetcode.com/problems/sort-colors/
//Time complexity :  O(n) , Space complexity : O(1)