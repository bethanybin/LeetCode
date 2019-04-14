/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = prev;
        return curr;
    }
}

//Results:
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//Memory Usage: 37.5 MB, less than 73.81% of Java online submissions for Reverse Linked List.
