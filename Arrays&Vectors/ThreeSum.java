//Function to return triplets whose sum equals to zero (No duplicates)
import java.util.*;

public class ThreeSum {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            
            Set<List<Integer>> set = new HashSet<List<Integer>>();
            
            //Sorting an array
            Arrays.sort(nums);
            
            int n = nums.length;
            
            for(int i=0;i<n-2;i++){
                //Two pointer approach
                int j = i+1;
                int k = n-1;
               
                int target = 0 - nums[i];
                
                while(j<k){
                    
                    int curr_sum = nums[j];
                    curr_sum += nums[k];
                          
                    if(curr_sum == target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                    }else if(curr_sum > target){
                        k--;
                    }else{
                        j++;
                    }
                    
                    
                }
            }
            
            for(List<Integer> t: set){
                result.add(t);
            }
            
            return result;
        }
}

// Link to Leetcode Problem -> https://leetcode.com/problems/3sum/ 
