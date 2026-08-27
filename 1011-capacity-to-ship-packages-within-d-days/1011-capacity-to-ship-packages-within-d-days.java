class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int big=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
            big=Math.max(big,weights[i]);
        }
        int left=big;
        int right=sum;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int requiredays=finddays(weights,mid);
            if(requiredays<=days)
            {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public int finddays(int[] weights,int capacity)
    {
        int reqday=1;
        int curweight=0;
        for(int weight:weights)
        {
            if(weight+curweight>capacity)
            {
                reqday++;
                curweight=0;
            }
            curweight+=weight;
        }
        return reqday;
    }
}