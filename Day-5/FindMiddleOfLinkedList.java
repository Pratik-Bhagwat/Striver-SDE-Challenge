 /*
    Question: Given the head of a singly linked list, return the middle node of the linked list.

    If there are two middle nodes, return the second middle node.

    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.

    link: https://leetcode.com/problems/middle-of-the-linked-list/
 */
 
 
 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

public class FindMiddleOfLinkedList{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node slow = head, fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}