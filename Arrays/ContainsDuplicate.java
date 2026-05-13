//Hashing pattern. number repeat twice check. By storing values in hashmap we can solve the problem in one for loop, Instead of doing brute force method.
//Complexity
//Time complexity:
//O(n)
//
//Space complexity:
//O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int val = nums[i];
            if(map.containsKey(val))
            {
                return true;
            }
            else
            {
                map.put(val, i);
            }
        }
        return false;
    }
}