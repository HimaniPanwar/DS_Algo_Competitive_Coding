//Moore's Voting Algorithm

public class majorityElement2 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for(int num : nums){
            if(count==0){
                candidate = num;
            }
            
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        
        return candidate;
    }
}

//Problem Link : https://leetcode.com/problems/majority-element/