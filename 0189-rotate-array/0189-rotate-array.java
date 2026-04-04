import java.util.Arrays;

class Solution {
    public static void rev(int[] nums, int a , int b){
        while(a<b){
            int temp = nums[a] ;
            nums[a] = nums[b];
            nums[b] = temp ;
            a++; b--;
        }

        // int j = b ;
        // for (int i=a ; i<j ;i++){
        //     int temp = nums[i] ;
        //     nums[i]= nums[j] ;
        //     nums[j--] = temp ;
        // }
    }

    public void rotate(int[] nums, int k) {
// in place krnaa haii!!
k = k%nums.length ;
        rev(nums ,0 , nums.length-1) ;
        rev(nums , 0 , k-1);
        rev(nums, k , nums.length-1) ;

}
}

// ?> idhr tum xud gae ho lala tumne void return ko array krke new array bnayaa jbki waha pe in place change krna tha na ki naya place assign lkrke... ese m jo original nums tha vop to unchanged reh gaya na lala//

//  static int[] rotate(int[] nums, int k){
//         int n= nums.length ;
//         k = k%n ;
//         int[] ans = new int[n];
//         int j = 0;
//         if(k==0) return nums ;
//         else{
//          for(int i=n-k ; i<n ;i++){
//             ans[j++]= nums[i];
//          }
//          for(int i=0 ; i<n-k ; i++){
//             ans[j++] = nums[i] ;
//          }
//         }
//          return ans ;
//     }
//     public static void main(String args[]){
//         int[] nums ={1,2,3,4,5,6,7};
//         int k = 3 ;
//        int[] ans = rotate(nums , k) ;
//        System.out.println(Arrays.toString(ans)) ;
//     }