package leetcode-solutions.array;

public class 0088_2_merge_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0, j = 0, idx = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[idx++] = nums1[i++];
            } else {
                temp[idx++] = nums2[j++];
            }
        }
        // 把剩下的接上
        while (i < m) temp[idx++] = nums1[i++];
        while (j < n) temp[idx++] = nums2[j++];
        // 复制回nums1
        for (int k = 0; k < temp.length; k++) {
            nums1[k] = temp[k];
        }
    }
}

/*
辅助数组写法
 */