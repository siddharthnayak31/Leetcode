class Solution {
    public int maxProfit(int[] prices) {
        int i =0 ; int pft = 0;
        for(int j=1 ; j<prices.length ; j++){
            if(prices[j]>prices[i]){
                pft += prices[j]-prices[i];
                i = j ;
            }
            else i++;
        }
        return pft;
    }
}