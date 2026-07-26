class Solution {
    public int binarySearch(int l, int r, int[] nums, int target) {
         while (l <= r){
            
            int m = (l + r) / 2;

            // Index of Element Returned
            if (nums[m] == target) {
                return m;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                // so we decrease our r pointer to mid - 1
            }
            else if (nums[m] > target) {
                r = m - 1;

                // Else the element can only be present
                // in right subarray
                // so we increase our l pointer to mid + 1
            }
            else {
                l = m + 1;
            }
        }

        // No Element Found
        return -1;
    }
    public int search(int[] nums, int target) {
       return binarySearch(0, nums.length - 1, nums, target);
    }
}
