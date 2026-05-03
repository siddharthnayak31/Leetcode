class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;  // If array has 2 or fewer elements, it's already valid

        int index = 2; // Start from the 3rd position
        for (int i = 2; i < n; i++) {
            // Compare current element with the element two positions before
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
