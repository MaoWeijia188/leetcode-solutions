public class 0026_remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int m=0;
        for(int i=0;i<nums.length-m;i++){
            int j=i+1;
            while(j<nums.length-m){
                if(nums[i]==nums[j]){
                    m++;
                    int p=j;
                    while(p<nums.length-1){
                        nums[p]=nums[p+1];
                        p++;
                    }
                }else j++;
            }
        }
        int k=nums.length-m;
        return k;
    }
}
/*
1.未使用快慢指针
2.while循环无尽
3.未用p代替j自增
4.length==0未考虑
5.重复数字换位后j不需自增，不然会略过一个数字
 */