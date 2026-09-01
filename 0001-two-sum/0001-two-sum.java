class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int[] ans={-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            int wanted=target-nums[i];
            if(m.containsKey(wanted))
            {
                ans[0]=i;
                ans[1]=m.get(wanted);
                return ans;
            }
            else{
                m.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}