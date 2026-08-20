class Solution {
        public boolean bisearch(int[] nums,int target) {
            int left =0;
            int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
               return true;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(matrix[mid][0]<=target && matrix[mid][c]>=target){
                return bisearch(matrix[mid],target);
            }
            else if(matrix[mid][0] > target){
                r = mid-1;
            }
            else{
                l =mid+1; 
            }
        }
        return false;
    }
}