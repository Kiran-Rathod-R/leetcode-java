
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;

        int[] arr = new int[len];

        for (int i = 0; i < m; i++) {

            arr[i] = nums1[i];

        }

        for (int j = 0; j < n; j++) {
            arr[m + j] = nums2[j];
        }
        Arrays.sort(arr);

        for (int k = 0; k < len; k++) {
            nums1[k] = arr[k];

        }

    }
}