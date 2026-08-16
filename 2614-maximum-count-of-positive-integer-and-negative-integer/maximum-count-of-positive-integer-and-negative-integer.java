class Solution {
    public int maximumCount(int[] nums) {
        int lNeg=neg(nums)+1;
        int fPos=nums.length-pos(nums);

        return Math.max(lNeg,fPos);
        
    }
    public int neg(int []  nums){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]<0){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
            return ans;

    }
    public int pos(int[] nums){
        int st=0;
        int end=nums.length-1;
        int aws=nums.length;

        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]>0){
                aws=mid;
                end=mid-1;
            }
            else st=mid+1;
        }
        return aws;
    }
}