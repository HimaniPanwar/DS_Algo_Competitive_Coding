package ArraysAndVectors;

public class TrappingRain {
    public int trap(int[] height) {
        int len = height.length;
        
        //If there are only two bars then no water will be trapped
        if(len<=2){
            return 0;
        }

        int[] left = new int[len];
        int[] right = new int[len];
        
        left[0] = height[0];
        right[len-1] = height[len-1];
        int i=0;
        
        //Finding maximum height while traversing from left and right
        for(i=1;i<len;i++){
           left[i] = Math.max(left[i-1],height[i]);
           right[len-i-1] = Math.max(right[len-i],height[len-i-1]);
        }
        
        int capacity = 0;
        
        //Finding minimum of height between left array and right array
        for(i=0;i<len;i++){
            capacity += (Math.min(left[i],right[i]) - height[i]);
        }
        
        return capacity;
    }
}

// Link to Leetcode Problem -> https://leetcode.com/problems/trapping-rain-water/
