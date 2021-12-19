package StriverSDEsheet.Arrays;

import java.util.*;

public class fourSumProblem {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        
        if(nums.length == 0 || nums == null)
            return result;
        
        Arrays.sort(nums);
       
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            
            int t1 = target - nums[i];
            
            for(int j=i+1;j<n;j++){
                
                int t2 = t1 - nums[j];
                
                int front = j+1;
                int back = n-1;
                
                while(front<back){
                    
                    int curr_sum = nums[front]+nums[back];
                    
                    if(curr_sum > t2){
                        back--;
                    }else if(curr_sum < t2){
                        front++;
                    }else{
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[front]);
                        list.add(nums[back]);
                        result.add(list);
                        
                        while(front<back && nums[front] == list.get(2))  ++front;
                        
                        while(front<back && nums[back] == list.get(3)) --back;
                    }
                }
                
                while(j+1<n && nums[j+1] == nums[j])  ++j;
                
            }
            
            while(i+1<n && nums[i+1] == nums[i]) ++i;
        }
        
        return result;
    }
}
