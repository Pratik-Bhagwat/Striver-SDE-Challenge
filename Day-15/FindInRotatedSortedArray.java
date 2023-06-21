/*
    Question: Aahad and Harshit always have fun by solving problems. Harshit took a sorted array consisting of distinct integers and rotated it clockwise by an unknown amount. For example, he took a sorted array = [1, 2, 3, 4, 5] and if he rotates it by 2, then the array becomes: [4, 5, 1, 2, 3].
    After rotating a sorted array, Aahad needs to answer Q queries asked by Harshit, each of them is described by one integer Q[i]. which Harshit wanted him to search in the array. For each query, if he found it, he had to shout the index of the number, otherwise, he had to shout -1.
    For each query, you have to complete the given method where 'key' denotes Q[i]. If the key exists in the array, return the index of the 'key', otherwise, return -1.

    Sample Input 1:
    4
    2 5 -3 0
    2
    5
    1
    Sample Output 1:
    1
    -1

    link: https://www.codingninjas.com/studio/problems/search-in-rotated-sorted-array_8230687?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

public class FindInRotatedSortedArray {
     public static int search(int arr[], int key) {
        // Write your code here.
        int n = arr.length;
        int start = 0, end = n-1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == key) return mid;

            else if(arr[start] <= arr[mid]) {
                if(arr[start] <= key && key <= arr[mid]) end = mid-1;
                else start = mid+1;
            }
            else {
                if(arr[mid] <= arr[end]) {
                    if(arr[mid] <= key && key <= arr[end]) start = mid+1;
                    else end = mid-1;
                }
            }
        }
        return -1;
    }
}