class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            freq[frequency].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i >= 0; i--) {
            for (int num : freq[i]) {
                result[index++] = num;

                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}