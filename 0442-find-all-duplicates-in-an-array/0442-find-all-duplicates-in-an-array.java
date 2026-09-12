class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int num:nums)
        {
            if(m.containsKey(num))
            {
                ans.add(num);
            }
            m.put(num,m.getOrDefault(num,0)+1);
        }
        return ans;
    }
}