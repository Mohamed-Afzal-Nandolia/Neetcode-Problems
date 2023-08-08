package BinarySearch.MedianOfTwoSortedArrays;

public class medianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] merge = new int[len];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]) {
                merge[k] = nums1[i];
                i++;
                k++;
            }
            else {
                merge[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < nums1.length) {
            merge[k] = nums1[i];
                i++;
                k++;
        }
        while (j < nums2.length) {
            merge[k] = nums2[j];
                j++;
                k++;
        }
        int mid = merge.length / 2;
        double median = 0.0;
        if (merge.length % 2 == 1) {//it is odd
            median = merge[mid];
        }
        else {
            median = (merge[mid] + merge[mid - 1]) / 2.0;
        }
        return median;
    }
}
