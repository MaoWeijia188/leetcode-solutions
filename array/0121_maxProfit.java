class Solution {
    public int maxProfit(int[] prices) {
        int gap=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
            if(prices[j]>prices[i]){
                gap=Math.max(gap,prices[j]-prices[i]);
            }
        }
        }
        return gap;
    }
}
/*
1.prices.length不用加();
数组.length是属性；
字符串.length()是方法；
总结：arr.length,str.length(),list.size();
2.j=i+1开始；
3.Math.max()是对的；
4.力扣内不需要用输入；
*/