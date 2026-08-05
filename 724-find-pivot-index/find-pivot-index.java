class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int []pref=new int[n];
        pref[0]=nums[0];
        for(int i =1;i<n;i++){
            pref[i]=nums[i]+pref[i-1];
        }
        int total=pref[n-1];
        if(total-nums[0]==0){
                return 0;
            }
        for(int i=1;i<n;i++){
            // int s=(total-pref[i-1]-nums[i]);
            if(total-nums[0]==0){
                return 0;
            }
            if(pref[i-1]==(total-pref[i-1]-nums[i])){
                return i;
            }
        }
        return -1;
    }
}