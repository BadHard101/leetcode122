package org.example;

class Solution4 {
    public int maxProfit(int[] prices) {      
        int profitFromPriceGain = 0;
        
        for( int i = 0 ; i < prices.length-1 ; i++ ){
            
            if( prices[i] < prices[i+1] ){
                profitFromPriceGain += ( prices[i+1] - prices[i] );
            }
        }
        
        return profitFromPriceGain;
    }
}