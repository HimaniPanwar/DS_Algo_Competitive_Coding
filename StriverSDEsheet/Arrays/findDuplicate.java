package StriverSDEsheet.Arrays;

import java.util.*;

public class findDuplicate {
        public int findDuplicateNo(int[] nums) {
            int len = nums.length;
            int res = 0;
            int[] arr = new int[len];
            
            Arrays.fill(arr,0);
            
            for(int i=0;i<len;i++){
                
                arr[nums[i]]++;
            }
            
            for(int i=1;i<len;i++){
                if(arr[i]>1){
                   res = i;
                   break;
                }
            }
            
            return res;
        }

}

//Problem Link : https://leetcode.com/problems/find-the-duplicate-number/
