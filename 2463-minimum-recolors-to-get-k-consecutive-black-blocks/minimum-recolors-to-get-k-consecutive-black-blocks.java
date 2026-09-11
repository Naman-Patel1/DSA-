class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int i=0;
        int j=k;
        int count=Integer.MAX_VALUE;

        while(j<=n){
            int w=i;
            int ct=0;
            while(w<j){
                if(blocks.charAt(w)=='W'){
                    ct++;
                    w++;
                }
                else{
                    w++;
                }
            }
            count=Math.min(count,ct);
            i++;
            j++;

            
        }
        return count;
        
    }
}