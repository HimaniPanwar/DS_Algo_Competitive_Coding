package StriverSDEsheet.Arrays;

import java.util.*;

public class numberOfMeetings {
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<List<Integer>> duration = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            duration.add(Arrays.asList(start[i],end[i]));
        }
        
        Collections.sort(duration,(a,b) -> a.get(1)-b.get(1));
        
        int ed = duration.get(0).get(1);
        int count = 1;
        
        for(List<Integer> itr:duration){
            if(itr.get(0)>ed){
                count++;
                ed = itr.get(1);
            }
        }
        
        return count;
    }
}

//Problem Link: https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#
