class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefixsum=new int[nums.length+1];
        prefixsum[0]=0;
        for(int i=1;i<=nums.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+nums[i-1];
            nums[i-1]=prefixsum[i];
        }
        return nums;
    }
}