class Solution {
    public int reverse(int x) {
        int n=x;
        int rev=0;
        if(n>=2147483647)
        {
            return 0;
        }
        while(Math.abs(n)>0)
        {
            int digit=n%10;
          if(rev>214748364 || rev==214748364 && digit>7)
          {
            return 0;
          }
          if(rev<-214748364 || rev==-214748364 && digit<-8)
          {
            return 0;
          }
              rev=rev*10+digit;
            n=n/10;
        }
        return rev;

    }
}