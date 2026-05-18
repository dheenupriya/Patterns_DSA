class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int maxLen = 0;
        HashSet<Character> map = new HashSet<>();

        while(j < s.length())
        {
            if(!map.contains(s.charAt(j)))
            {
                map.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            }
            else
            {
                map.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}