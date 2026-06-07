class Solution {
    public void sortColors(int[] nums) {

        int low = 0 ; int mid = 0; int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                // swap(nums[mid] ,nums[low]);
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                // swap(nums[mid], nums[high]);
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    // void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
}