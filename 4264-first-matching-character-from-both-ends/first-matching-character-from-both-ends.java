class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        int idx=n;
        int ct=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                idx=Math.min(idx,i);
                ct++;
            }
            
        }
        if(ct<0){
            return -1;
        }
        else return idx;
    }
}