class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashMap<Integer, Integer> duplicate = new HashMap<Integer, Integer>();
      for(int i = 0; i < nums.length; i++) {
        if(duplicate.containsKey(nums[i])) {
            return true;
        }
        duplicate.put(nums[i], i);
    }
    return false;
}
}
