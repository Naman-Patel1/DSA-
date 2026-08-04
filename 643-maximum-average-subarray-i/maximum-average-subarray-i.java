class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n =nums.length;
        int low=0;
        int high=k-1;
        int sum=0;

        for(int i =0;i<k;i++){
            sum+=nums[i];

        }
        double maxSum=sum;
        while(k<n){
            maxSum=Math.max(maxSum,sum);
            sum-=nums[low];
            low++;
            high++;
            if(high>=n){
                break;
            }
            sum+=nums[high];
        }
        double p= maxSum/k;

        return p;

        
    }
}