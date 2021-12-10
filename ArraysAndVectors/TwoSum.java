package ArraysAndVectors;

import java.util.HashMap;

//Function to return index of elements which add up to a target sum
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                break;
            }
            
            map.put(nums[i],i);
        }
        
        return result;
    }
}

// Link to Leetcode Problem -> https://leetcode.com/problems/two-sum/ 