class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int max=0;
        int pref=0;
        for(int i=0;i<n;i++){
            pref+=gain[i];
            max=Math.max(max,pref);
        }        
        return max;
    }
}