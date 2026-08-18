class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int max=0;
        int [] freq=new int[256];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            freq[ch]++;

            while(freq[ch]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;


    }
}