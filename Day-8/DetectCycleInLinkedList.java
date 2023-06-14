/*
    Question: You are given a Singly Linked List of integers. Return true if it has a cycle, else return false.
    A cycle occurs when a node's next points back to a previous node in the list.


    Example:
    In the given linked list, there is a cycle, hence we return true.

    Input: head = [3,2,0,-4], pos = 1
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

    link: https://leetcode.com/problems/linked-list-cycle/
*/

public class DetectCycleInLinkedList {
     public static boolean detectCycle(Node head) {
        // Your code goes here
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
