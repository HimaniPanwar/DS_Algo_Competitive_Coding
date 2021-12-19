package StriverSDEsheet.Arrays;

import java.util.*;

//Approach using merge sort
public class countInversions {

    public static long getInversions(long arr[], int n) {
        long count = merge_sort(arr,0,n-1);
        
        return count;
    }
    
    public static long merge_sort(long[] arr,int left,int right){
        long inv_count=0;
        
        if(right>left){
            int mid = (right+left)/2;
            inv_count += merge_sort(arr,left,mid);
            inv_count += merge_sort(arr,mid+1,right);
            
            inv_count += merge(arr,left,mid,right);
        }
        
        return inv_count;
    }
    
    public static long merge(long[] arr,int l,int m,int r){
        // Left subarray
        long[] left = Arrays.copyOfRange(arr, l, m + 1);
 
        // Right subarray
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
 
        int i = 0, j = 0, k = l, swaps = 0;
 
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        
        return swaps;
    }
}

//Problem Link : https://www.codingninjas.com/codestudio/problems/count-inversions_615?leftPanelTab=0
