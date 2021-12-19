package StriverSDEsheet.Arrays;

import java.util.*;

public class longestConsecutiveSeq {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            
            for(int num : nums){
                set.add(num);
            }
            
            int longestStreak = 0;
            
            for(int num : nums){
                if(!set.contains(num-1)){
                    int currentnum = num;
                    int currentStreak = 1;
                    
                    while(set.contains(currentnum+1)){
                        currentnum += 1;
                        currentStreak += 1;
                    }
                    
                    longestStreak = Math.max(longestStreak,currentStreak);
                }
            }
            
            return longestStreak;
           
        }

}
