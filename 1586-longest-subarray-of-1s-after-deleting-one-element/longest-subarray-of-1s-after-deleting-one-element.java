class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int count=0;
        int len=0;
        int left=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
                
            }
            len=Math.max(len,i-left);
        }
        return len;
        
    }
}