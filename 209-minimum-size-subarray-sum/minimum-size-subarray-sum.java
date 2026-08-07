class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n =nums.length;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                int len=i-j+1;
                min=Math.min(min,len);
                sum-=nums[j];
                j++;
            }
        }

        return min == Integer.MAX_VALUE ? 0: min;

    }
}