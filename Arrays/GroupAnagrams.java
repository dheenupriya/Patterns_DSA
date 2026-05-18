class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs)
        {
            char[] ch = s.toCharArray(); // ['t','e','a']
            Arrays.sort(ch); // ['a','e','t']
            String key = new String(ch); // aet

            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s); //add the string for the respective key.
        }
        return new ArrayList<>(map.values());
    }
}