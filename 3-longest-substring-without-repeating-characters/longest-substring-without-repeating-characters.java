class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int [] freq=new int[256];
        int j=0;
        int res=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            freq[ch]++;

            while(freq[ch]>1 && j<n){
                freq[s.charAt(j)]--;
                j++;
            }
                int len=i-j+1;
                res=Math.max(res,len);
        }
        return res;
        
        
    }
}