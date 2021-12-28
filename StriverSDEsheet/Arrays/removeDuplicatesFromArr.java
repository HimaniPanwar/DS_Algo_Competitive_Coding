package StriverSDEsheet.Arrays;

//Remove duplicates from sorted array
public class removeDuplicatesFromArr {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k=0;
        
        for(int i=1;i<len;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }else{
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}
