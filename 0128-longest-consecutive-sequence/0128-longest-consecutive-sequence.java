class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
         // Add all elements to the set to remove duplicates
        for(int i : nums){
            set.add(i);

             /* Loop through each element in the set to find 
           the starting point of consecutive sequences */
        }
        for(int i: set){
            // If there is no number before 'i', i is the start of a sequence
            if(!set.contains(i-1)){
                int cnt = 1;
                 int x = i;

            // Keep checking for the next consecutive number
            while(set.contains(x+1)){
                //increase the local counter.
                cnt++;
                // Move to the next number in sequence
                x++;

            }
             // Update the longest sequence length if needed
            longest = Math.max(cnt,longest);
            }
            
        }
        return longest;
    }
}