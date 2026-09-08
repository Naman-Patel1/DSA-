class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int i=0;
        int j=2;
        int count=0;
        while (j<n){
            if(s.charAt(j)!=s.charAt(j-1) && s.charAt(j-1)!=s.charAt(i) && s.charAt(j)!= s.charAt(i)){
                count++;
                j++;
                i++;
            }
            else{
                j++;
                i++;
            }
        }
        return count;

        
    }
}