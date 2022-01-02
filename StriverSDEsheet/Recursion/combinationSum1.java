package StriverSDEsheet.Recursion;

import java.util.*;

public class combinationSum1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0,candidates,target,ans,new ArrayList<Integer>());
        return ans;
    }
    
    public static void findComb(int ind,int[] cand,int target, List<List<Integer>> ans,List<Integer> ds){
        if(ind==cand.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(cand[ind]<=target){
            ds.add(cand[ind]);
            findComb(ind,cand,target-cand[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        
        findComb(ind+1,cand,target,ans,ds);
    }
}

//Problem Link: https://leetcode.com/problems/combination-sum/
