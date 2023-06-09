/*
    Question: Given the head of a singly linked list, reverse the list, and return the reversed list.

    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]

	link: https://www.codingninjas.com/codestudio/problems/reverse-linked-list_8230724?challengeSlug=striver-sde-challenge
*/


class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
    }

public class ReverseALinkedList {

    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> prev = null;

		while(curr != null) {
			LinkedListNode<Integer> nextOfCurr = curr.next;

			curr.next = prev;
			prev = curr;
			curr = nextOfCurr;
		}
			head = prev;
			return prev;
    } 
}