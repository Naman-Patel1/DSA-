class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        long sum = 0;
        long max = 0;

        HashSet<Integer> set = new HashSet<>();

        while(j < n){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum += nums[j];
                j++;
            }
            else{
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            if(j - i == k){
                max = Math.max(max, sum);

                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }

        return max;
    }
}