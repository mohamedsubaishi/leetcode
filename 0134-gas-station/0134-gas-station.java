class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curgas=0;
        int start=0;
        int total=0;
        for(int i=0;i<gas.length;i++)
        {
           curgas+=gas[i];
           curgas-=cost[i];
           total+=gas[i]-cost[i];
           if(curgas<0)
           {
            start=i+1;
            curgas=0;
           }
        }
        if(total>=0)
        return start;
        return -1;
    }
}