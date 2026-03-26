class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // left pointer of sliding window
        int left = 0;
        
        // stores maximum length found
        int maxLength = 0;
        
        // map to store character and its last index
        HashMap<Character, Integer> map = new HashMap<>();
        
        // right pointer expands the window
        for (int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);
            
            // if character already exists → move left pointer
            // ensure we don't move left backward
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            
            // update latest index of character
            map.put(ch, right);
            
            // update max length of valid substring
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        // return final answer
        return maxLength;
    }
}