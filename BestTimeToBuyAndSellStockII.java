//Complexity
//Time complexity:
//O(n)
//
//Space complexity:
//O(n)

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int mini = prices[0];

        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < mini)
            {
                mini = prices[i];
            }
            else
            {
                int profit = prices[i] - mini;
                maxprofit += profit;
                mini = prices[i];
            }
        }
        return maxprofit;

    }
}