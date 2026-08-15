class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> ar= new HashMap<>();
        for(int i=0;i<n;i++){
            ar.put(arr[i],ar.getOrDefault(arr[i],0)+1);
        }

        int max=0;
        for(int x: ar.keySet()){
            if(x==ar.get(x)){
                max=Math.max(max,x);
            }

        }
        if(max>0){
            return max;
        }
        else return -1;
    }
}