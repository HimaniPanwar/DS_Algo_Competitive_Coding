package StriverSDEsheet.Greedy;

import java.util.*;

public class jobSequencing {
    int[] JobScheduling(Job arr[], int n)
    {
        
       Arrays.sort(arr,(a,b) -> b.profit-a.profit);
       int maxS = 0;
       
       for(int i=0;i<n;i++){
           maxS = Math.max(maxS,arr[i].deadline);
       }
       
       int[] temp = new int[maxS+1];
       
       Arrays.fill(temp,-1);
       int countJobs = 0, profit = 0;
       
       for(int i=0;i<n;i++){
           for(int j=arr[i].deadline;j>0;j--){
               if(temp[j] == -1){
                   temp[j] = i;
                   countJobs++;
                   profit += arr[i].profit;
                   break;
               }
           }
       }
       
       int[] res = new int[2];
       res[0] = countJobs;
       res[1] = profit;
       
       return res;
    }
}

//Problem Link: https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#
