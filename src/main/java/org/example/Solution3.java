package org.example;

import java.util.ArrayList;

class Solution3 {
    
    
    public int maxProfit(int[] prices) {

        ArrayList<Integer> priceGain = new ArrayList<>();
        
        for(int idx = 0 ; idx < prices.length-1; idx++){
            
            if( prices[idx] < prices[idx+1] ){
                priceGain.add( prices[idx+1]- prices[idx]);
            }
                
        }
        return priceGain.stream().mapToInt(n->n).sum();
        
    }
}