/*
    Question: You have been given a long type array/list 'ARR' of size 'N'. It represents an elevation map wherein 'ARR[i]' denotes the elevation of the 'ith' bar. Print the total amount of rainwater that can be trapped in these elevations.
    Note :
    The width of each bar is the same and is equal to 1.

    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

    link: https://leetcode.com/problems/trapping-rain-water/description/
*/

public class TappingRainwater {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        int start = 0, end = n-1;
        long rightMax = 0, leftMax = 0;
        long ans = 0;
        while(start <= end) {
            if(arr[start] <= arr[end]) {
                if(arr[start] >= leftMax) {
                    leftMax = arr[start];
                }
                else {
                    ans += (leftMax - arr[start]);
                }
                start++;
            }
            else {
                if(arr[end] >= rightMax) {
                    rightMax = arr[end];
                }
                else {
                    ans += (rightMax - arr[end]);
                }
                end--;
            }
        }
        return ans;
    }
}

