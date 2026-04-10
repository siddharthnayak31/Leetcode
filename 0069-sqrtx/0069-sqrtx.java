class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // Base cases: 0 → 0, 1 → 1

        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {   // Avoid overflow
                ans = mid;          // mid is a valid candidate
                left = mid + 1;     // Try larger values
            } else {
                right = mid - 1;    // Try smaller values
            }
        }
        return ans;
    }
}