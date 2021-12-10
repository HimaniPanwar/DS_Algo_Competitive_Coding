package ArraysAndVectors;

import java.util.ArrayList;

import java.util.*;

public class MinimumDifference {
    
    public static List<Integer> minDiff(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;
        int result = Integer.MAX_VALUE;

        while(i<n && j<m){
            
            if(Math.abs(arr1[i]-arr2[j]) < result ){
                result = Math.abs(arr1[i]-arr2[j]);
                list.clear();
                list.add(arr1[i]);
                list.add(arr2[j]);
            }
 
            if(arr1[i]<arr2[j])
                i++;
            else
                j++;

        }
        return list;
    }

    public static void main(String[] args) {
        int[] a1 = {23, 5, 10, 17, 30};
        int[] a2 = {26, 134, 135, 14, 19};

        List<Integer> answer = minDiff(a1,a2);

        System.out.println(answer);
    }
    
}
