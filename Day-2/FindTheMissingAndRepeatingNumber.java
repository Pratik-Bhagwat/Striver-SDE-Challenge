/*
    Question: You are given a read only array of n integers from 1 to n.

    Each integer appears exactly once except A which appears twice and B which is missing.

    Return A and B.

    Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    Note that in your output A should precede B.

    Input:[3 1 2 5 3] 

    Output:[3, 4] 

    A = 3, B = 4

    link : https://www.codingninjas.com/codestudio/problems/missing-and-repeating-numbers_8230733?challengeSlug=striver-sde-challenge
*/

import java.util.* ;

public class FindTheMissingAndRepeatingNumber {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] freq = new int[n+1];
        int[] res = new int[2];

        for(int i=0; i<n; i++) {
            freq[arr.get(i)]++;
        }

        for(int i=1; i<freq.length; i++) {
            if(freq[i] == 0) res[0] = i;
            if(freq[i] > 1) res[1] = i;
        }
        
        return res;
    }
}
