class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        
        for (int num : nums) {
            if (num < pivot) small.add(num);
            else if (num == pivot) equal.add(num);
            else large.add(num);
        }
        
        small.addAll(equal);
        small.addAll(large);
        
        int[] result = new int[nums.length];
        for (int i = 0; i < small.size(); i++) {
            result[i] = small.get(i);
        }
        
        return result;
    }
}