//Approach
//Track minimum so far while scanning
//        Complexity
//Time complexity:
//O(n)
//
//Space complexity:
//O(n)
//
//Code
class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < mini)
            {
                mini = prices[i];
            }
            else
            {
                int profit = prices[i] - mini;
                if(profit > maxprofit)
                {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }
}