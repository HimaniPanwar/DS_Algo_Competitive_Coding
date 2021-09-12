public class ArrayProducts {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        int temp = 1, n = nums.length;
        
        for(int i=0;i<n;i++){
            prod[i] = 1;
        }
        
        for(int i=0;i<n;i++){
            prod[i] = temp;
            temp *= nums[i];
        }
        
        temp = 1;
        
        for(int i=n-1;i>=0;i--){
            prod[i] *= temp;
            temp *= nums[i];
        }
        
        return prod;
    }
}

// Link to Leetcode Problem -> https://leetcode.com/problems/product-of-array-except-self/