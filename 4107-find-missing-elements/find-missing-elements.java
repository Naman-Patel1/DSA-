class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        int temp=nums[0]+1;

        for(int i =1;i<n;i++){
            if(nums[i]==temp){
                temp++;
            }
            else{
                while(nums[i]>temp){
                    arr.add(temp);
                    temp++;
                }
                temp++;
            }
        }

        return arr;
    }
}