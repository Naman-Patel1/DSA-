class Solution {
    public int smallestNumber(int n, int t) {
        // ArrayList<Integer> arr=new ArrayList<>();
        int m=n;    
        while(true){
            int l=m;
            ArrayList<Integer> arr=new ArrayList<>();
            while(l>0){
                int digit=l%10;
                arr.add(digit);
                l/=10;
            }

            long pro=1;
            for(int num: arr){
                pro*=num;
            }
        
            if(pro%t==0){
                return m;
            }
            m++;
            arr.clear();
            l=m;



        }
    
    }
}