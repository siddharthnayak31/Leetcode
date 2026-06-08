import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0]; int maxPft = 0;
        for(int i = 1; i< prices.length;i++){
            maxPft = Math.max(prices[i]-mini,maxPft);

            mini = Math.min(mini,prices[i]);
        }
        return maxPft;
    }
}