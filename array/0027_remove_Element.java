class Solution {
    public int removeElement(int[] nums, int val) {
        int m=0;
        for(int i=0;i<nums.length-m;i++){
            if(nums[i]==val){
                m++;
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                i--;
            }
        }
        int k=nums.length-m;
        return k;
    }
}

/*
逻辑运行顺序写反了
时间复杂度O(n^2)过高
*/