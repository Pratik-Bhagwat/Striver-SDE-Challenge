/*
    Question : Problem Statement

    You are given a linked list having ‘n’ nodes and an integer ‘k’. 

    You have to rotate the linked list to the right by ‘k’ positions .


    Example :
    Input: linked list = [1 2 3 4] , k = 2

    Output: 3 4 1 2

    Explanation:
    We have to rotate the given linked list to the right 2 times. After rotating it to the right once it becomes 4->1->2->3. After rotating it to the right again, it becomes 3->4->1->2. 

    link : https://www.codingninjas.com/codestudio/problems/rotate-linked-list_8230752?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/
public class RotateLinkedListKTimes {
    public static Node rotate(Node head, int k) {

        if (head == null || head.next == null || k == 0) return head;
        
        // calculating length
        Node curr = head;
        int length = 1;
        while (curr.next != null) {
            length++;
            curr = curr.next;
        }
        
        // link last node to first node
        curr.next = head;
        k = k % length; // when k is more than length of list
        int end = length - k; // to get end of the list
        while (end-- > 0) {
            curr = curr.next;
        }

        // breaking last node link and pointing to NULL
        head = curr.next;
        curr.next = null;

        return head;
    }
}