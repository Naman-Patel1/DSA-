class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;

        int j=0;
        for(int i =0;i<n;i++){
            sum+=nums[i];

            while(sum>=target){
                    int len=i-j+1;
                    min=Math.min(min,len);
                    sum-=nums[j];
                    j++;
            }
        }
        if(min<Integer.MAX_VALUE){
            return min;
        }
        else return 0;
    }
}