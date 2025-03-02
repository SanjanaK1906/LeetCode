/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
  Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
class Solution {
    public int romanToInt(String s) {
        int ans=0;int num=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':num= 1 ;break;
                case 'V':num= 5;break;
                case 'X':num= 10;break;
                case 'L':num= 50;break; 
                case 'C':num= 100;break; 
                case 'D':num= 500;break; 
                case 'M':num= 1000;break; 
            }
            if(4*num<ans){
                ans-=num;
            }else{
                ans+=num;
            }
        }
        return ans;
    }
}
