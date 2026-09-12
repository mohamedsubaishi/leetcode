class Solution {
    int ans=0;
    public int diagonalPrime(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<m;i++)
        {
            if(isprime(nums[i][i]))
            {
                ans=Math.max(ans,nums[i][i]);
            }
            if(isprime(nums[i][n-1-i]))
            {
                ans=Math.max(ans,nums[i][n-1-i]);
            }
        }
        return ans;
    }
    public boolean isprime(int x)
    {
        if(x<2)
        return false;
        for(int i=2;i*i<=(x);i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
}