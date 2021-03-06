package StriverSDEsheet.Arrays;

public class stockBuyAndSell {
    
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE,maxProfit = 0;
            
            for(int i=0;i<prices.length;i++){
                if(minPrice > prices[i]){
                    minPrice = prices[i];
                }else if(prices[i]-minPrice > maxProfit){
                    maxProfit = prices[i]-minPrice;
                }
            }
            
            return maxProfit;
        }
    
}

//Problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/