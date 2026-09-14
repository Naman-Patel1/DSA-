class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        int l = 0;
        int n = nums.size();
        unordered_map<int, int> mp;
        long long curSum = 0;
        long long maxSum = 0;
        for(int r = 0; r < n; r++){
            curSum += nums[r];
            mp[nums[r]]++;
            if((r - l + 1) == k){
                if(mp.size() == k){
                    maxSum = max(maxSum, curSum);
                }
                curSum -= nums[l];
                mp[nums[l]]--;
                if(mp[nums[l]] <= 0){
                    mp.erase(nums[l]);
                }
                l++;
            }
        }  

        return maxSum;
    }
};