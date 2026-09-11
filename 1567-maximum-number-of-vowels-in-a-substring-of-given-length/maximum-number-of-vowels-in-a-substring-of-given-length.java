class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int i=0,j=k;
        int count=0;
        s=s.toLowerCase();
        int ct=0;
        for(int l=0;l<j;l++){
            if(s.charAt(l)=='a' || s.charAt(l)=='e' || s.charAt(l)=='i' || s.charAt(l)=='o' || s.charAt(l)=='u'){
                ct++;
            }
        }
        count=ct;

        while(j<n){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                ct--;
            }
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                ct++;
            }
            
            i++;
            j++;
            count=Math.max(count,ct);
        }
        return count;
        
    }
}