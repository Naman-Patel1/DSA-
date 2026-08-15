class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        
        int max=candies[n-1];
        for(int i=0;i<n;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        ArrayList<Boolean> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=candies[i]+extraCandies;
            if(value>= max){
                arr.add(true);
            }
            else {
                arr.add(false);
            }
        }
        return arr;
    }
}