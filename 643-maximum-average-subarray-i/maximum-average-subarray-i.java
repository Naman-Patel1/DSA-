class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=k;
        int sum=0;
        for(int a=0;a<k;a++){
            sum+=nums[a];
        }
        // float ans;
        double ans = (double) sum / k;
        while(j<n){
            // float avg=sum/k;    
            sum-=nums[i];
            i++;
            sum+=nums[j];
            j++;
            double avg = (double) sum / k;
            ans=Math.max(ans,avg);
            

        }
        return ans;
        
    }
}