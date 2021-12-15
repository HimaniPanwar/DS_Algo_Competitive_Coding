import java.util.HashMap;

public class longestSubstringWORepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        int n = s.length();
        int left = 0,right=0;
        int maxLen = 0;
        
        while(right<n){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            
            maxLen = Math.max(maxLen,right-left+1);
            
            right++;
        }
        
        return maxLen;
    }
}

//Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
