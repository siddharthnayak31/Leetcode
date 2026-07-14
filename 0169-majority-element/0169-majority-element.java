class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++; //wrongggg [6,5,5]
            }
            else if(num==candidate) count++ ; 
            else count-- ;
            //OR->short:    count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}



        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<arr.length, i++){
        //     if (map.contains(arr[i]))
        // }