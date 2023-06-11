/*
    Question: You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.

    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]

    link: https://leetcode.com/problems/merge-two-sorted-lists/
*/

class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

public class MergeTwoLinkedList {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> dummy = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> curr = dummy;

        while(first != null && second != null) {
            if(first.data <= second.data) {
                curr.next = first;
                curr = curr.next;
                first = first.next;
            }
            else {
                curr.next = second;
                curr = curr.next;
                second = second.next;
            }
        }
        if(first == null) {
            curr.next = second;
        }
        if(second == null) {
            curr.next = first;
        }
        return dummy.next;
	}
}