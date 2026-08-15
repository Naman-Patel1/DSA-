class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int m=index.length;
        ArrayList<Integer> lm=new ArrayList<>();

        for(int i=0;i<n;i++){
            lm.add(index[i],nums[i]);
        }

        int [] target=new int[n];
        for(int i=0;i<n;i++){
            target[i]=lm.get(i);
        }
        
        return target;
    }
}