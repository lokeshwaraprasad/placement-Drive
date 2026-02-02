class Solution {
    public int[] restoreFinishingOrder(int[] order, int[] friends) {
        // Put friends in a HashSet for O(1) lookup
        Set<Integer> set = new HashSet<>();
        for (int f : friends) {
            set.add(f);
        }

        int[] result = new int[friends.length];
        int idx = 0;

        // Traverse finishing order
        for (int id : order) {
            if (set.contains(id)) {
                result[idx++] = id;
            }
        }

        return result;
    }
}
