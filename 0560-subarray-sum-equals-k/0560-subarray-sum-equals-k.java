
        import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // base case

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;

            // check if (currSum - k) exists
            if (prefixMap.containsKey(currSum - k)) {
                count += prefixMap.get(currSum - k);
            }

            // update hashmap
            prefixMap.put(currSum, prefixMap.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}