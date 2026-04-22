package arrays;

import java.util.Arrays;

public class MergeSortedArray {
    static void main() {
        int [] nums1 = {1,2,3,0,0,0}; int m = 3;  int [] nums2 = {2,5,6}; int n = 3;
        mergeSorted(nums1,m,nums2,n);
    }

    private static void mergeSorted(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
             if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
