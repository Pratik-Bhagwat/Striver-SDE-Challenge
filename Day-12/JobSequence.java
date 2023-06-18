/*
    Question: You are given a N x 2 2-D array 'Jobs' of 'N' jobs where Jobs[i][0] denote the deadline of i-th job and Jobs[i][1] denotes the profit associated with i-th job.
    You will make a certain profit if you complete the job within the deadline associated with it. Each job takes 1 unit of time to be completed, and you can schedule only one job at a particular time.
    Your task is to find out the maximum profit that you can make.
    Note :
    If a particular job has a deadline 'x', it means that it needs to be completed at any time interval before 'x'.

    Sample Input 1 :
    2
    4
    2 2 1 1
    30 40 10 10
    5
    2 4 1 3 5
    25 40 5 50 60
    Sample Output 1 :
    70
    180

    link: https://www.codingninjas.com/codestudio/problems/job-sequencing-problem_8230832?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/
import java.util.*;

public class JobSequence {
    public static int jobScheduling(int[][] jobs) {
        // Write your code here
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        int maxEndTime = 0;
        for (int[] job : jobs) {
            maxEndTime = Math.max(maxEndTime, job[0]);
        }

        int[] res = new int[maxEndTime + 1];
        Arrays.fill(res, -1);
        int profit = 0;

        for (int[] job : jobs) {
            for (int j = job[0]; j > 0; j--) {
                if (res[j] == -1) {
                    res[j] = job[0];
                    profit += job[1];
                    break;
                }
            }
        }

        return profit;
    }    
}

