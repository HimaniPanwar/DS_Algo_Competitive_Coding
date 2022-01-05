package StriverSDEsheet.Recursion;

import java.util.*;

public class permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recFunc(0,nums,res);
        return res;
    }
    
    static void recFunc(int ind,int[] nums,List<List<Integer>> ans) {
        if(ind == nums.length){
            List<Integer> ds = new ArrayList<>();
            
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            
            ans.add(ds);
            
            return;
                
        }
        
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            recFunc(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    
    static void swap(int i,int j,int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

//Problem Link: https://leetcode.com/problems/permutations/
