package StriverSDEsheet.Recursion;

import java.util.*;

public class subsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> subsetSum = new ArrayList<>();
        func(0,0,arr,N,subsetSum);
        Collections.sort(subsetSum);
        return subsetSum;
    }
    
    static void func(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        func(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

        func(ind + 1, sum, arr, N, sumSubset);
    }
}

//Problem Link: https://practice.geeksforgeeks.org/problems/subset-sums2234/1#