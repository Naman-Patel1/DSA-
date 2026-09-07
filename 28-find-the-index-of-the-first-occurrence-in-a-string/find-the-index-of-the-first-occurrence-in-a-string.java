class Solution {
    public int strStr(String haystack, String needle) {
        // int  n =haystack.indexOf(needle);
        // return n ;
        int n=haystack.length();
        int m=needle.length();

        int i=0;
        int j=0;
        while(i<n && j<m){
            if(haystack.charAt(i)== needle.charAt(j)){
                if(j==m-1){
                    return i-j;
                }
                i++;
                j++;
            }
            else{
                i=i-j+1;
                j=0;
            }


        }
        return -1;
    }
}