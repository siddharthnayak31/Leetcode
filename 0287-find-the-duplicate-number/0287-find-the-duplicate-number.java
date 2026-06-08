class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i : nums){
            if(nums[i-1] == nums[i]) ans = i;
        }
        return nums[ans];
    }
}