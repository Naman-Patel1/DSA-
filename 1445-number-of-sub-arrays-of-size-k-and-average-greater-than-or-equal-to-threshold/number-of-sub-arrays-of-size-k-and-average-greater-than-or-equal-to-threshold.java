class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int i=0,j=k;
        int sum=0;
        for(int a=0;a<k;a++){
            sum+=arr[a];
        }
        int count =0;
        while(j<n){
            int avg=sum/k;
            if(avg>=threshold){
                count++;
                sum-=arr[i];
                i++;
                sum+=arr[j];
                j++;
            }
            else{
                sum-=arr[i];
                i++;
                sum+=arr[j];
                j++;
            }
        }
        if(sum>=threshold * k){
            count++;
        }
        return count;
    }
}