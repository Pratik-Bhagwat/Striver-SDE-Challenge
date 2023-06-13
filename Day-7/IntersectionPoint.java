/*
    Question: You are given two Singly Linked Lists of integers, which may have an intersection point.

    Your task is to return the first intersection node. If there is no intersection, return NULL.


    Example:-
    The Linked Lists, where a1, a2, c1, c2, c3 is the first linked list and b1, b2, b3, c1, c2, c3 is the second linked list, merging at node c1.

    link: https://www.codingninjas.com/codestudio/problems/intersection-of-two-linked-lists_8230688?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

public class IntersectionPoint {
     public static int findIntersection(Node firstHead, Node secondHead) {

        if(firstHead == null && secondHead == null) return 0;
        //Write your code here
        Node dummy1 = firstHead;
        Node dummy2 = secondHead;

        while(dummy1 != dummy2) {
            dummy1 = dummy1 == null ? secondHead:dummy1.next;
            dummy2 = dummy2 == null ? firstHead:dummy2.next;
        }
        return dummy1.data;
    }
}
