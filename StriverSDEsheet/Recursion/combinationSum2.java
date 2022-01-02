package StriverSDEsheet.Recursion;

import java.util.*;

public class combinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    
    public static void findComb(int ind,int[] cand,int target, List<List<Integer>> ans, List<Integer> ds){

        if(target == 0) {
            ans.add(new ArrayList<>(ds)); 
            return; 
        }
        
        for(int i = ind; i < cand.length;i++) {
            if(i > ind && cand[i] == cand[i-1]) continue; 
            if(cand[i]>target) break; 
            
            ds.add(cand[i]); 
            findComb(i+1, cand, target - cand[i], ans, ds); 
            ds.remove(ds.size() - 1); 
        }
        
    }
}

//Problem Link: https://leetcode.com/problems/combination-sum-ii/
