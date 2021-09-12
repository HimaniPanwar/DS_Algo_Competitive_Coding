public class MountainProblem {
    public int longestMountain(int[] a) {
        int n = a.length;
        
        int largest = 0;
        
        for(int i=1;i<n-1;){
            
            //Finding whether peak or not
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                
                int cnt = 1;
                int j = i;
                
                //Tracking backwards to reach left end of mountain
                while(j>=1 && a[j]>a[j-1]){
                    j--;
                    cnt++;
                }
                
                //Tracking forwards to reach right end of mountain
                while(i<=n-2 && a[i]>a[i+1]){
                    i++;
                    cnt++;
                }
                
                largest = Math.max(largest, cnt);
                
            }else{
                i++;
            }
                 
        }
              
        return largest;
    }
}

// Link to Leetcode Problem -> https://leetcode.com/problems/longest-mountain-in-array/