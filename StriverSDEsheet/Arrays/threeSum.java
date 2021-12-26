package StriverSDEsheet.Arrays;

import java.util.*;

public class threeSum {
    public List<List<Integer>> threeSumP(int[] nums) {
        
        int n=nums.length;
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
       
        for(int i=0;i<n-2;i++){
          if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
             int j = i+1;
             int k = n-1;
               
             int target = 0 - nums[i];
            
             while(j<k){
                    
                    int curr_sum = nums[j];
                    curr_sum += nums[k];
                          
                    if(curr_sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        
                        while (j < k && nums[j] == nums[j+1]) j++;
                        while (j < k && nums[k] == nums[k-1]) k--;
                        
                        j++;
                        k--;
                    }else if(curr_sum > target){
                        k--;
                    }else{
                        j++;
                    }                  
             }
          }
        
        }
        
        return res;
    }
}
