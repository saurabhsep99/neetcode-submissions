class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {

            int j = 0;

            // Find position where nums2[i] should be inserted
            while (j < m && nums1[j] <= nums2[i]) {
                j++;
            }

            // Shift elements to the right
            for (int k = m; k > j; k--) {
                nums1[k] = nums1[k - 1];
            }

            // Insert nums2[i]
            nums1[j] = nums2[i];

            // nums1 now contains one more valid element
            m++;
        }
    }
}