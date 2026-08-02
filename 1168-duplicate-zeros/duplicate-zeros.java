class Solution {
    public void duplicateZeros(int[] arr) {
        int n =arr.length;
        ArrayList<Integer> arrL=new ArrayList<>();

        int i=0;
        while(i<n){
            arrL.add(arr[i]);
            if(arr[i]==0){
                arrL.add(0);
            }
            i++;
        }

        for(int j=0;j<arr.length;j++){
            arr[j]=arrL.get(j);
        }
    }
}