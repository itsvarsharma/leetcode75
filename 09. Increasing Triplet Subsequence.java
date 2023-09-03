class Solution {
    int max=Integer.MAX_VALUE;
    public boolean increasingTriplet(int[] nums) {
        int one=max,two=max;
        for(int n:nums){
            if(n<=one)one=n;
            else if(n<=two)two=n;
            else return true;
        }
        return false;
    }
}
