class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            int ele=nums[i];
            int wanted=target-ele;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==wanted)
                {
                    ans[k++]=i;
                    ans[k++]=j;
                  return ans;
                }
            }
        }
        return new int[0];
    }
}