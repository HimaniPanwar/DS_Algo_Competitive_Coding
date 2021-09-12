public class SubarraySort{

    //Function to return the length of unsorted subarray sorting which will make whole array sorted
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        if(n==1){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            
            int x = nums[i];
            
            if(outOfOrder(nums, i)){
                smallest = Math.min(smallest,x);
                largest = Math.max(largest,x);
            }
        }
        
        int left = 0;
        int right = n-1;
        
        //If no out of order elements then no unsorted subarray
        if(smallest == Integer.MAX_VALUE){
             return 0;
        }
        

        //Next steps to check where the smallest and largest elemen should lie
        while(smallest >= nums[left]){
            left++;
        }
        
        while(largest <= nums[right]){
            right--;
        }
        
        //If question is about returning pair of starting and ending index then return {left,right}
        return (right-left+1);
    }
    
    //Function to check whether element is out of order or not
    public boolean outOfOrder(int[] arr, int i){
        
        int x = arr[i];
        
        if(i == 0){
            return x>arr[i+1];
        }
        if(i == arr.length-1){
            return x<arr[i-1];
        }
        
        //Element is out of order if it is smaller than previous element or greater than next element
        return (x>arr[i+1] || x<arr[i-1]);
    }
}

// Link to Leetcode Problem -> https://leetcode.com/problems/shortest-unsorted-continuous-subarray/