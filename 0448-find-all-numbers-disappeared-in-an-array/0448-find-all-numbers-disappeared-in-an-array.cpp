class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n=nums.size();
        vector<int>s(n+1,0);
        vector<int>res{};
        for(auto num:nums)
        {
            s[num]++;
        } 
        for(int i=1;i<=n;i++)
        {
            if(!s[i])
            {
                res.push_back(i);
            }
        }
        return res;
    }
};