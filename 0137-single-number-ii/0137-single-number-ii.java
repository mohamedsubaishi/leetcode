class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int num:nums)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int num:nums)
        {
            if(m.get(num)==1)
            return num;
        }
        return -1;
    }
}