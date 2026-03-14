import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int r = 0;int l = 0;int maxVal =0 ; int zeros = 0;
        while (r < nums.length){
            if(nums[r]==0) zeros++;
            while(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }

            maxVal = Math.max(maxVal, r-l+1);
            r++;
        }
        return maxVal;
    }
}