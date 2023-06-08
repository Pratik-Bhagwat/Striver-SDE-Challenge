/*
    Question: You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 

    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.

    nums2 has a length of n.

    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    link: https://www.codingninjas.com/codestudio/problems/merge-two-sorted-arrays_8230835?challengeSlug=striver-sde-challenge
*/

public class MergeTwoSortedArrays {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] res = new int[m+n];
        int i = 0 , j = 0, k = 0;

        while(i<m && j<n) {
            if(arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            }
            else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < m) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
}
