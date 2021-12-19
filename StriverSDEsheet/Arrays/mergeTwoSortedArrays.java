package StriverSDEsheet.Arrays;

import java.util.*;

public class mergeTwoSortedArrays {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m,j=0;
            
            while(i<m+n && j<n){
                nums1[i++] = nums2[j++];
            }
            
            Arrays.sort(nums1);
        }
}

//Problem Link : https://leetcode.com/problems/merge-sorted-array/
