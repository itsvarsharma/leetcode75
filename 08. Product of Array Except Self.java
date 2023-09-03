class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product=1;int zero=0;
        for(int n:nums){
            if(n==0)zero++;
            else product*=n;
        }
        for(int i=0;i<nums.length;i++){
            if(zero>0 && (nums[i]!=0 || zero>1))nums[i]=0;
            else nums[i]=(nums[i]!=0)?(int)(product/nums[i]):(int)product;
        }
        return nums;
    }
}
