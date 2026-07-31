class Solution {
    public int dominantIndex(int[] nums) {
        int n =nums.length;
        int max=0;
        int smax=0;

        for(int i =0;i<n;i++){
            if(nums[i]>=max){
                smax=max;
                max=nums[i];
            }
            if(smax<nums[i] && nums[i]<max){
                smax=nums[i];
            }
        }
        if(max>= (2*smax) ){
            for(int i =0;i<n;i++){
                if(nums[i]==max){
                    return i;
                }
            }


        }
        return -1;

    }
}