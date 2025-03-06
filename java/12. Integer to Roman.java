/*Example 1:

Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
Example 2:

Input: num = 58

Output: "LVIII"

Explanation:

50 = L
 8 = VIII
Example 3:

Input: num = 1994

Output: "MCMXCIV"

Explanation:

1000 = M
 900 = CM
  90 = XC
   4 = IV
 

Constraints:

1 <= num <= 3999

  */
class Solution {
    public String intToRoman(int num) {
        StringBuilder s= new StringBuilder();
        String[]sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[]val=  {1000, 900, 500,400, 100, 90, 50, 40,  10,  9,  5,  4, 1};
        for(int i=0;i<val.length;++i){
            if(num==0){
                break;
            }
            while (num>=val[i]){
                    s.append(sym[i]);
                    num-=val[i];
            }
        }
        return s.toString();
    }
}
