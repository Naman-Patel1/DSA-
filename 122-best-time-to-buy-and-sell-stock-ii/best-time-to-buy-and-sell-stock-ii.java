class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        for(int i =1;i<n;i++){
            int m=i-1;
            int profit=prices[i]-prices[m];

            if(profit>0){
                 max+=profit;
            }
            else{
                m++;
            }
            
        }
        return max;        
    }
}