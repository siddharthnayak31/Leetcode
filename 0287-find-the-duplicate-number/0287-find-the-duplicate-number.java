class Solution {
    public int findDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            // int ans = -1 ;
            for(int i : nums){
                if(set.contains(i)) {
                    return i;
                }
            set.add(i);
           } 

         return -1;


        // Arrays.sort(nums);
        // int ans = 0;
        // for(int i : nums){
        //     if(nums[i-1] == nums[i]) ans = i;
        // }
        // return nums[ans];
    }
}