/*
    Question: Find the Duplicate Element in the array. this is guranted that only one element is repeated.

    input : [1,2,2,3]
    output : 2
 */

import java.util.* ;

public class FindDuplicateInArray {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int[] freq = new int[n];

        for(int i=0; i<n; i++) {
            freq[arr.get(i)]++;
            if(freq[arr.get(i)] > 1) return arr.get(i);
        }
        return -1;
    }
}
