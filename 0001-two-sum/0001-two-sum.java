import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
// optimal approach: HashMap
int arr[] = {-1};
HashMap<Integer, Integer> mp = new HashMap<>();
for(int i=0;i<nums.length;i++){
    int partner = target-nums[i];
    if(mp.containsKey(partner)){
        arr = new int[] {i,mp.get(partner)};
        return arr;
    }
    mp.put(nums[i],i);
}
return arr;



//BruteForce:
    //     int ans[] = new int[2];
    //     for(int i =0 ; i<nums.length; i++){
    //         for(int j =i+1  ; j<nums.length; j++){
    //             if(nums[i] + nums[j]== target) {
    //                 ans[0]=i;
    //                 ans[1]=j;
    //                return ans; 
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // public static void main(String args[]){
    //   // Solution s = new Solution() ;
    //    int[] arr = {2,7,11,15};
    //    int target = 9;
    //     System.out.println(twoSum(arr , target));
    // }
    }
}