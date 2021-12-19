package StriverSDEsheet.Arrays;

import java.util.*;

public class mergeIntervals {
        public int[][] merge(int[][] intervals) {
            List<int[]> res = new ArrayList<>();
            
            if(intervals.length == 0 || intervals == null)
                return res.toArray(new int[0][]);
            
            Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
            
            int start = intervals[0][0];
            int end = intervals[0][1];
            
            for(int[] t : intervals){
                if(t[0] <= end){
                    end = Math.max(end,t[1]);
                }else{
                    res.add(new int[]{start,end});
                    start = t[0];
                    end = t[1];
                }
            }
            
            res.add(new int[]{start, end});
            
            return res.toArray(new int[0][]);
            
            
        }   
}

//Problem Link: https://leetcode.com/problems/merge-intervals/ 
