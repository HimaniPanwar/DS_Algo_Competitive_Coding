package StriverSDEsheet.Arrays;

public class maxConsecutiveOnes{
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC=0,i=0;
        int count=0;
        
        while(i<nums.length){
            
            if(nums[i]==1){
                count++;
            }else{
                maxC = Math.max(maxC,count);
                count=0;
            }
            
            i++;
        }
        
        maxC = Math.max(maxC,count);
        
        return maxC;
    }
}