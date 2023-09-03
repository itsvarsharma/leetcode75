class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            int pre=i>0?flowerbed[i-1]:0;
            int nex=i<flowerbed.length-1?flowerbed[i+1]:0;
            if(flowerbed[i]==0 && pre==0 && nex==0){
                n--;
                flowerbed[i]=-1;
            }
            if(n<=0)break;
        }
        return n<=0;
    }
}
