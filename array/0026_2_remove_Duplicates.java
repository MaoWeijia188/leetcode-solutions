public class 0026_2_remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int fast=0;
        int slow=0;
        while(fast<nums.length){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
            fast++;
        }
        int k=slow+1;
        return k;
    }
}
/*
1.快慢双指针解法，更简洁
2.要注意最后一项不能出问题，不能被落下了
*/
