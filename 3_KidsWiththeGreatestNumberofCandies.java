class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max=0;

        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }

        for(int c:candies){
            if(c+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }    
}
