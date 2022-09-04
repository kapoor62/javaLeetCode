class Solution {
    public int searchInsert(int[] nums, int target) {
        int pivot, left =0, right = nums.length -1;
        while (left <= right){
            pivot = left + (right-left)/2;
            if (target == nums[pivot]) return pivot;
            if (target > nums[pivot])  left = pivot+1;
            else right = pivot-1;

        }
        return left;
    }
}
