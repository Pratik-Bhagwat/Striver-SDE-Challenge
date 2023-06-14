/*
    Question: Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
    
    Input: head = [1,2,2,1]
    Output: true

    link: https://leetcode.com/problems/palindrome-linked-list/description/
*/

public class PalindromeLinkedList {
    public Node reverseList(Node head){
        Node previous = null;
        Node current = head;

        while(current != null)
        {
            Node nextOfCurr = current.next;

            current.next = previous;
            previous = current;
            current = nextOfCurr;
        }
        head = previous;
        return head;
    }

    public boolean isPalindrome(Node head) {
        
        if(head == null || head.next == null) return true;
		
		Node slow = head, fast = head, dummy = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		slow.next = reverseList(slow.next);
		slow = slow.next;
		
		while(slow != null) {
			if(slow.data != dummy.data) return false;
			dummy = dummy.next;
			slow = slow.next;
		}
		return true;
    }
}
