import java.util.*;

public class MinimumSwaps {
    public int countMinSwaps(int[] arr){
        int ans = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        Arrays.sort(arr);

        boolean[] visited = new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            int old_pos = map.get(arr[i]);
            
            if(visited[i] == true || old_pos == i){
                continue;
            }

            int node = i;
            int cycle = 0;

            while(!visited[node]){
                visited[node] = true;

                int next_node = map.get(arr[node]);
                node = next_node;
                cycle += 1;
            }

            ans += cycle-1;
        }

        return ans;
    }
}


