class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
//hikh
        // int i =0;
        // int j=n-1;
        // while(i<=j){

        //     if(arr[i]+arr[j]==target){
        //         return new int[]{i+1,j+1};
        //     }
        //     else if(arr[i]+arr[j]>target){
        //         j--;
        //     }
        //     else{
        //         i++;
        //     }
            
        // }
        // return new int[]{-1,-1};
        for(int i=0;i<n;i++){
            int need=target-arr[i];
            int l=i+1;
            int r=n-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(arr[mid]==need){
                    return new int[]{i+1,mid+1};
                }
                else if(need<arr[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }


            }
        }
        return new int[]{-1,-1};


    }
}