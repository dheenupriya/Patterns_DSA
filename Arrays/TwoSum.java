//Approach
//Hashing pattern. Think “For current number, what value do I need?”.
//Complexity
//Time complexity:
//O(n)
//Space complexity:
//O(n)


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int required = target - nums[i];
            if(hash.containsKey(required))
            {
                return new int[]{hash.get(required), i};
            }
            else
            {
                hash.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}