/*
    Question: You have been given a singly Linked List of 'N' nodes with integer data and an integer 'K'.

    Your task is to remove the 'K'th node from the end of the given Linked List and return the head of the modified linked list.


    Example:
    Input : 1 -> 2 -> 3 -> 4 -> 'NULL'  and  'K' = 2
    Output: 1 -> 2 -> 4 -> 'NULL'
    Explanation:
    After removing the second node from the end, the linked list become 1 -> 2 -> 4 -> 'NULL'.

    link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
*/

public class DeleteKthNodeFromEnd {
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy, fast = dummy;
        
        while(K-- > 0) fast = fast.next;
        
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
