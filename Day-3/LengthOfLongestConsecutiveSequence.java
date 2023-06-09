/*
    Question: Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

    You must write an algorithm that runs in O(n) time.

    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

    link: https://www.codingninjas.com/codestudio/problems/longest-consecutive-sequence_8230708?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

import java.util.* ;

public class LengthOfLongestConsecutiveSequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++) {
            set.add(arr[i]);
        }
        
        int length = 1;
        for(int ele: set) {
            if(!set.contains(ele - 1)) {
                int cnt = 1;
                int currEle = ele;

                while(set.contains(currEle + 1)) {
                    cnt++;
                    currEle += 1;
                }
                length = Math.max(cnt, length);
            }
        }
        return length;
    }
}