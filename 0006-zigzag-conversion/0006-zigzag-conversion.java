class Solution {
    public String convert(String s, int numrows) {
        if(s.length()<numrows || numrows==1)
        {
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numrows];
        for(int i=0;i<numrows;i++)
        {
            rows[i]=new StringBuilder();
        }
        int row=0;
        int direction=1;
        for(char ch:s.toCharArray())
        {
            rows[row].append(ch);
            if(row==0)
            {
                direction=1;
            }
            if(row==numrows-1)
            {
                direction=-1;
            }
            row=row+direction;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder ch:rows)
        {
            res.append(ch);
        }
        return res.toString();
    }
}