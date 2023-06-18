/*
    Question: You have been given two arrays, 'AT' and 'DT', representing the arrival and departure times of all trains that reach a railway station.
    Your task is to find the minimum number of platforms required for the railway station so that no train needs to wait.
    Note :
    1. Every train will depart on the same day and the departure time will always be greater than the arrival time. For example, A train with arrival time 2240 and departure time 1930 is not possible.

    2. Time will be given in 24H format and colons will be omitted for convenience. For example, 9:05AM will be given as "905", or 9:10PM will be given as "2110".

    3. Also, there will be no leading zeroes in the given times. For example, 12:10AM will be given as “10” and not as “0010”.

    Sample Input 1:
    2
    6
    900 940 950 1100 1500 1800
    910 1200 1120 1130 1900 2000
    4
    100 200 300 400
    200 300 400 500
    Sample Output 1:
    3
    2

    link: https://www.codingninjas.com/codestudio/problems/minimum-number-of-platforms_8230720?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

import java.util.*;

public class MinimumNumberOfPlatforms {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);

        int i = 0, j = 0;
        int res = 0, platform = 0;

        while(i < n && j< n) {
            if(at[i] > dt[j]) {
                platform--;
                j++;
            }
            if(at[i] <= dt[j]) {
                platform++;
                i++;
            }
            if(platform > res) {
                res = platform;
            }
        }
        return res;
    }
}
