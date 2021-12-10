package ArraysAndVectors;

import java.util.*;

public class BandProblem{
    //Function to check longest subsequence in which consecutive elements differ by 1
    public static int largestBand(int[] arr){

        Set<Integer> set = new HashSet<Integer>();

        int longestBand = 1;

        for(int it: arr){
            set.add(it);
        }

        for(int p : arr){

            int parent = p-1;

            if(!set.contains(parent)){
                int next_num = p + 1;
                int cnt = 1;

                while(set.contains(next_num)){
                    next_num++;
                    cnt++;
                }

                longestBand = Math.max(longestBand,cnt);
            }
            
        }

        return longestBand;
    } 

    public static void main(String[] args){
        int[] arr = {1,9,3,0,18,5,2,4,10,7,12,6};

        System.out.println(largestBand(arr));
    }
}