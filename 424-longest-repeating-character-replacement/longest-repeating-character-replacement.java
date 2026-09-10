class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq=new int[26];
        int n=s.length();
        int left=0;
        int right=0;
        int maxFreq=-1;
        int len=0;

        for(int i=right;i<n;i++){
            freq[s.charAt(i)-'A']++;

            maxFreq=Math.max(maxFreq,freq[s.charAt(i)-'A']);
            while( ((i-left+1) - maxFreq)>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            len=Math.max(len,i-left+1);



        }

        return len;
    }
}