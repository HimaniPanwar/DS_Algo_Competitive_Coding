//Extended Boyer Moore's Voting algorithm

import java.util.*;

public class majorityElement3 {
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            ArrayList<Integer> ans = new ArrayList<>();
            
            int n1=-1,n2=-1,c1=0,c2=0;
            int n = nums.length;
            
            for(int i=0;i<n;i++){
                if(nums[i] == n1)
                    c1++;
                else if(nums[i] == n2)
                    c2++;
                else if(c1 == 0){
                    n1 = nums[i];
                    c1 = 1;
                }else if(c2 == 0){
                    n2 = nums[i];
                    c2 = 1;
                }else{
                    c1--;
                    c2--;
                }
            }
            
            c1 = 0;
            c2 = 0;
            
            for(int i=0;i<n;i++){
                if(nums[i] == n1)
                    c1++;
                else if(nums[i] == n2)
                    c2++;
            }
            
            if(c1 > n/3)
                ans.add(n1);
            if(c2 > n/3)
                ans.add(n2);
            
            return ans;
        }
    }
}


//Problem Link : https://leetcode.com/problems/majority-element-ii/