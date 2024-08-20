// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
package mediaOfTwoSortedArrays;

public class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int hight = m;
        while (low <= hight) {
            int partitionM = (low + hight) / 2;
            int partitionN = (m + n + 1) / 2 - partitionM;

            int maxLeftM = (partitionM == 0) ? Integer.MIN_VALUE : nums1[partitionM - 1];
            int minRightM = (partitionM == m) ? Integer.MAX_VALUE : nums1[partitionM];

            int maxLeftN = (partitionN == 0) ? Integer.MIN_VALUE : nums2[partitionN - 1];
            int minRightN = (partitionN == n) ? Integer.MAX_VALUE : nums2[partitionN];

            if (maxLeftM <= minRightN && maxLeftN <= minRightM) {
                boolean esPar = (((m + n) % 2) == 0) ? true : false;

                if (esPar) {
                    return ((double) Math.max(maxLeftM, maxLeftN) + Math.min(minRightM, minRightN)) / 2;
                } else {
                    return (double) Math.max(maxLeftM, maxLeftN);
                }
            } else if (maxLeftM > minRightN) {
                hight = partitionM - 1;
            } else {
                low = partitionM + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}