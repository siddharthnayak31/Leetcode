import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*The common prefix across all strings must exist between the smallest and largest string when sorted lexicographically.
Sorting the array helps bring these boundary strings to the extremes.
By comparing only the first and last strings, we can determine the full common prefix shared by the entire array.*/

        Arrays.sort(strs);
        int i = 0;
        String s  = strs[0];
        String t  = strs[strs.length - 1];
        while(i<s.length() && i<t.length()){
            if (s.charAt(i) == t.charAt(i)) i++ ;
            else break;
        }
        return s.substring(0,i);
    }
}