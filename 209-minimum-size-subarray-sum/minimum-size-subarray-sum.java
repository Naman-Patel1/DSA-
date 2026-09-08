class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        int min=Integer.MAX_VALUE,sum=0;

        for(i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                int len=i-j+1;
                min=Math.min(min,len);
                sum-=nums[j];
                j++;
            }

        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
    }
}