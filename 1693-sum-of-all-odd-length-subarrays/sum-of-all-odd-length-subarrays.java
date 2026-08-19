class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int []pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<  n;i++){
            pref[i]=arr[i]+pref[i-1];
        }
        int start=0;
        int end=0;
        int sum=0;
        // int j=1;
        while(start<=end && start<n){
            while(end<n){
            int len=end-start+1;
                if(len%2==1){
                    if(start>0){
                        sum+=pref[end]-pref[start-1];

                    }else{
                        sum+=pref[end];
                    }

                }
                end++;
            }
            start+=1;
            end=start;
            // j++;
        }

        return sum;
    }
}