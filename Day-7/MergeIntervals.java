/*
    Question: Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

    link: https://leetcode.com/problems/merge-intervals/description/
*/

import java.util.*;

public class MergeIntervals {

        public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        //here we are sorting the array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If current interval doesn't overlap with the previous interval, add it as a new interval
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            // If current interval overlaps, update the end of the previous interval
            else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }

        // Convert the result from list format to a 2D array
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }

        return res;
    }

}
