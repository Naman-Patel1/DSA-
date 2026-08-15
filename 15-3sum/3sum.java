class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int st=i+1;
            int end=n-1;
            while(st<end){
                int sum=nums[i]+nums[st]+nums[end];
                if(sum==0){
                    arr.add(Arrays.asList(nums[i],nums[st],nums[end]));

                
                while(st>end && nums[st]==nums[st+1]){
                    st++;
                }
                while(st<end && nums[end]==nums[end-1]){
                    end--;
                }
                st++;
                end--;
                }

                
                else if(sum<0){
                    st++;
                }
                else end--;
               
            }

        }
        return arr;
    }
}