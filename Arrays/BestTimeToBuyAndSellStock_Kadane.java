class Solution {
    public int maxProfit(int[] prices) {
        //Kadane pattern - accumulate postive and ignore negative.
        int currentSum = 0;
        int max_profit = 0;
        for(int i=1; i< prices.length; i++)
        {
            int diff = prices[i] - prices[i-1];
            currentSum += diff;
            if(currentSum < 0)
            {
                currentSum = 0;
            }
            else if(currentSum > max_profit)
            {
                max_profit = currentSum;
            }
        }
        return max_profit;
    }
}