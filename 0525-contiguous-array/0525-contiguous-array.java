class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        HashMap<Integer,Integer>m=new HashMap<>();
        m.put(0, -1);
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(m.containsKey(sum))
            {
                int ans=i-m.get(sum);
                res=Math.max(res,ans);
            }
            else{
                m.put(sum,i);
            }
        }
        return res;
    }
}