class Solution {
    

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // pointer for last valid element in nums1
        int i = m - 1;

        // pointer for last element in nums2
        int j = n - 1;

        // pointer for last position in nums1 (including extra space)
        int k = m + n - 1;

        /*
        We fill nums1 from the BACK.
        Compare the largest elements from both arrays
        and place the larger one at index k.
        */

        while(i >= 0 && j >= 0){

            // if element in nums1 is larger
            if(nums1[i] > nums2[j]){

                // place nums1 element at position k
                nums1[k] = nums1[i];
                i--;
            }
            else{

                // place nums2 element at position k
                nums1[k] = nums2[j];
                j--;
            }

            // move final position pointer
            k--;
        }

        /*
        If elements still remain in nums2,
        copy them into nums1.

        (No need to copy nums1 elements because
        they are already in correct position)
        */
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}