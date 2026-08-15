class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> b - a
        );
        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            int result = stone1 - stone2;

            if (result > 0) {
                maxHeap.add(result);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
