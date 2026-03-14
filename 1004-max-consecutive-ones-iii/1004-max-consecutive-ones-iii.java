import java.util.*;

class Solution {
    public int longestOnes(int[] nums, int k) {

        // r → right pointer of sliding window
        int r = 0;

        // l → left pointer of sliding window
        int l = 0;

        // Stores maximum length of valid subarray
        int maxVal = 0;

        // Counts number of zeros inside the current window
        int zeros = 0;

        // Traverse array using right pointer
        while (r < nums.length){

            // If current element is 0, increase zero count
            if(nums[r]==0) zeros++;

            // If zeros exceed k, shrink window from left
            while(zeros>k){

                // If element leaving window is 0, decrease zero count
                if(nums[l]==0) zeros--;

                // Move left pointer forward
                l++;
            }

            // Update maximum window length
            // r - l + 1 gives current window size
            maxVal = Math.max(maxVal, r-l+1);

            // Expand window by moving right pointer
            r++;
        }

        // Return longest valid subarray length
        return maxVal;
    }
}

// there is one more optimised method in which when our zeros get out of control we do not just move left pointer till it comes in control but we stop the updation and continue moving r and l till zeros come in control
// Optimized Sliding Window Idea:
//
// When the number of zeros becomes greater than k,
// instead of shrinking the window completely using a while loop,
// we can move both pointers together.
//
// In this approach:
// - When zeros > k, we stop updating the answer.
// - We move the left pointer by one step.
// - At the same time, we keep moving the right pointer forward.
//
// Eventually, when a zero leaves the window, zeros become <= k again.
// Then we resume updating the maximum length.
//
// This works because the window size remains valid without repeatedly
// shrinking it fully every time zeros exceed k.
//
// Benefit:
// - Reduces unnecessary shrinking operations
// - Still maintains O(n) time complexity
// - Often slightly faster in practice