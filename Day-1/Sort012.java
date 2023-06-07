/*
        Question: Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
        
        with the colors in the order red, white, and blue. We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

        You must solve this problem without using the library's sort function.

        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]
*/
public class Sort012 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int n = arr.length;
        int zeroCnt = 0 , oneCnt = 0, twoCnt = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == 0) zeroCnt++;
            else if(arr[i] == 1) oneCnt++;
            else twoCnt++;
        }

        for(int i=0; i<zeroCnt; i++) {
            arr[i] = 0;
        }
        for(int i=zeroCnt; i<zeroCnt+oneCnt; i++) {
            arr[i] = 1;
        }
        for(int i=zeroCnt+oneCnt; i<n; i++) {
            arr[i] = 2;
        }
    }
}
