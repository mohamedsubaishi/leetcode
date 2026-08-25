class Solution {
    public int candy(int[] ratings) {
        int[] candy=new int[ratings.length];
        if(ratings.length==1)
        return 1;
        for(int i=0;i<ratings.length;i++)
        {
            candy[i]=1;
        }
        for(int i=0;i<ratings.length;i++)
        {
            if(i==0)
            {
                if(ratings[i]>ratings[i+1])
                candy[i]=2;
            }
            else if(i==ratings.length-1)
            {
                if(ratings[i]>ratings[i-1])
               candy[i]=1+candy[i-1];
            }
            else{
                if(ratings[i]>ratings[i-1])
                {
                    candy[i]=1+candy[i-1];
                }
            }
           
}
 for(int i=ratings.length-2;i>=0;i--)
{
    if(ratings[i]>ratings[i+1])
    {
        candy[i] = Math.max(candy[i], candy[i+1]+1);
    }


        }
        int ans=0;
        for(int num:candy)
        {
            ans+=num;
        }
        return ans;
    }
}