/*
Given a string s, find the length of the longest 
substring
 without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
//time & space- O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<s.length();i++){
            int temp= sb.indexOf(String.valueOf(s.charAt(i)));
            if(temp !=-1){
                sb.delete(0,temp+1);
            }
                sb.append(s.charAt(i));
                if(max<sb.length()){
                    max= sb.length();
                }
        }
        return max;
    }
}

