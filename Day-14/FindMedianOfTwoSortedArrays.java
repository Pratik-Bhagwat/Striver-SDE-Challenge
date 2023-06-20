/*
 Question: Given two sorted arrays 'a' and 'b' of size 'n' and 'm' respectively.


Find the median of the two sorted arrays.


Median is defined as the middle value of a sorted list of numbers. In case the length of list is even, median is the average of the two middle elements.


The expected time complexity is O(min(logn, logm)), where 'n' and 'm' are the sizes of arrays 'a' and 'b', respectively, and the expected space complexity is O(1).

Sample Input 1:
3 3
2 4 6
1 3 5
Sample Output 1:
3.5

link: https://www.codingninjas.com/studio/problems/median-of-two-sorted-arrays_8230788?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

public class FindMedianOfTwoSortedArrays {
    public static double median(int[] a, int[] b) {
        // Write your code here.
        int m = a.length;
        int n = b.length;

        if (m > n) {
            int[] tempArr = a;
            a = b;
            b = tempArr;

            int temp = m;
            m = n;
            n = temp;
        }

        int left = 0;
        int right = m;
        int halfLen = (m + n + 1) / 2;

        while (left <= right) {
            int i = (left + right) / 2;
            int j = halfLen - i;

            if (i < m && b[j - 1] > a[i]) {
                left = i + 1;
            } else if (i > 0 && a[i - 1] > b[j]) {
                right = i - 1;
            } else {
                int maxLeft;
                if (i == 0) {
                    maxLeft = b[j - 1];
                } else if (j == 0) {
                    maxLeft = a[i - 1];
                } else {
                    maxLeft = Math.max(a[i - 1], b[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight;
                if (i == m) {
                    minRight = b[j];
                } else if (j == n) {
                    minRight = a[i];
                } else {
                    minRight = Math.min(a[i], b[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }

        return 0.0;
    }
}
