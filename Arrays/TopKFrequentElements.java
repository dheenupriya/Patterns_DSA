//Approach
//Solution using Heap as well as via sorting.
//Code
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] frequent = new int[k];
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int key: map.keySet())
        {
            heap.add(key);
            if(heap.size() > k )
            {
                heap.poll();
            }
        }
        int[] result = new int[k];
        int i=0;
        while (!heap.isEmpty()) {
            result[i++] = heap.poll();
        }

        return result;
/*
        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        for (int i = 0; i < k; i++) {
            frequent[i] = list.get(i);
        }

        return frequent;
        */

    }
}