class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int result=0;

        while(i<j){
            int wid=j-i;
            int minH=Math.min(height[i],height[j]);
            int area=minH*wid;
            result=Math.max(result,area);


            if(height[i]<height[j]){
                i++;
            }
            else j--;
        }
        return result;
    }
}