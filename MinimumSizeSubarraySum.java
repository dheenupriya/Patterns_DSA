//# Approach
//Sliding window
//
//# Complexity
//- Time complexity:
//O(n)
//
//- Space complexity:
//O(n)

# Code
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int currentSum = 0;
        int minLen = Integer.MAX_VALUE;
        while(j < nums.length)
        {
            currentSum += nums[j];
            while (currentSum >= target) {  // shrink as much as possible

                int lenarray = j - i + 1;
                minLen = Math.min(lenarray, minLen);

                currentSum -= nums[i];
                i++;
            }
            j++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
