//Approach
//2 pointer approach
//Complexity
//Time complexity:
//O(n)
//
//Space complexity:
//O(n)
//
//Code
class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j)
        {
            int min = Math.min(height[i], height[j]);
            int area = min * (j - i);
            maxarea = Math.max(maxarea, area);
            if(height[i] < height[j])
            {
                i++;
            }
            else{
                j--;
            }

        }
        return maxarea;
    }
}