class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int count=0;
        int len=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                count++;
            }
            if(count>k){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            len=Math.max(len,j-i+1);
        }
        return len;
    }
}