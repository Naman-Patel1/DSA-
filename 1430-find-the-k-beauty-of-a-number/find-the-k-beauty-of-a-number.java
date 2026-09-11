class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int n =s.length();
        int i=0;
        int j=k;
        String div="";
        for (int a=0;a<k;a++) {
            div+=s.charAt(a);
        }
        int count=0;
        while(j<=n){
            int F=Integer.parseInt(div);
            if (F!=0 && num%F==0) {
                count++;
            }
            if(j<n){
                div=div.substring(1) +s.charAt(j);
            }
            i++;
            j++;
        }
        
        return count;
    }
}