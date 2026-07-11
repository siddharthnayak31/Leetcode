class Solution {
    public int trap(int[] height) {
        int  n = height.length;
        int lmax=0 ; int rmax= 0 ;int total = 0 ; int l = 0; int r = n-1;
        while(l<=r){
            if(height[l] <= height[r]){
                if(height[l]<lmax){
                    //store ans
                    total += lmax - height[l];
                }
                else{
                    //no left to support so store current as new lmax and move l pointer after both condn.
                    lmax = height[l];
                }
                l++;
            }
            else{
                //when arr[r]<arr[l] meanas water is supported bby left so check at right side locally
                if(rmax>height[r]){
                    total+= rmax-height[r];
                }
                else{
                    rmax = height[r];
                    // not here r--;
                }
                r--;
            }
        }
                    return total;

    }
}