class Solution {
    public boolean isIsomorphic(String s, String t) {

     // HashMap to store mapping between characters of s -> t
     // Example: a -> x
     HashMap <Character , Character> map = new HashMap();

    // Traverse both strings character by character
    for(int i=0 ; i<s.length()  ;i++){

        // Current character from string s
        Character sCh = s.charAt(i);

        // Current character from string t
        Character tCh = t.charAt(i);

        // If character from s already has a mapping
        if(map.containsKey(sCh)){

            // Check if the mapped character is same as current t character
            // If not same → strings are not isomorphic
            if( map.get(sCh) != tCh) return false;
        }

        // If sCh is not mapped yet but tCh is already mapped
        // to some other character → invalid mapping
        else if(map.containsValue(tCh)){
             return false;
        }

        // If both characters are new
        // create a new mapping sCh -> tCh
    else {
        map.put(sCh ,tCh);
      }
    }

        // If no conflicts found, strings are isomorphic
        return true;
    }
}