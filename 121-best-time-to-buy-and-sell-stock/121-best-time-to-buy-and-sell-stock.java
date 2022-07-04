class Solution {
    public int maxProfit(int[] prices) {
       if(prices.length < 2)
           return 0;
        
        int min = prices[0];
        int max = 0;
        for(int price: prices){
            
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }
}