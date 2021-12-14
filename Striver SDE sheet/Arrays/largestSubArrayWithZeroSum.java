import java.util.*;

public class largestSubArrayWithZeroSum {
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0,maxS = 0;
        
        for(int i=0;i<n;i++){
            sum += arr[i];
            
            if(sum == 0)
                maxS = i+1;
            else{
                if(map.get(sum) != null ){
                    maxS = Math.max(maxS,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        
        return maxS;
    }
}
