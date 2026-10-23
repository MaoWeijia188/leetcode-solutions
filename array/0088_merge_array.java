package leetcode-solutions.array;

public class 0088_merge_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            int x = nums2[i];
            int pos = 0;
            while(pos < m && nums1[pos] <= x){
                pos++;
            }
            for(int k = m; k > pos; k--){
                nums1[k] = nums1[k-1];
            }
            nums1[pos] = x;
            m++;
        }
    }
}
/*
未能将问题清晰的细化成几个分明的部分；
设置的指针不够清晰，没考虑到首尾和重复情况的处理；
*/