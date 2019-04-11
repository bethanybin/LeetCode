//first solution: recursive

//         if(head == null || head.next == null){
//             return true;
//         }
//         ListNode p1 = head;
//         ListNode beg = head.next;
//         ListNode prev = p1;
//         while(p1.next != null){
//             prev = p1;
//             p1 = p1.next;
//         }
//         prev.next = null;
//         if(p1.val != head.val){
//             return false;
//         }
        
//         return isPalindrome(beg);

//final implementation
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        int counter = 0;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        while(p2 != null && p2.next != null){
            if(p2.next.next == null){
                p2 = p2.next;
                p1 = p1.next;
                break;
            }
            counter++;
            p2 = p2.next.next;
            p1 = p1.next;
        }
        ListNode prev = null;
        ListNode curr = p1.next;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = prev;
        for(int i = 0; i <= counter; i++){
            if(head.val != curr.val){
                return false;
            }
            head = head.next;
            curr = curr.next;
        }
        return true;
    }
}

//Results:
//Runtime: 1 ms, faster than 94.11% of Java online submissions for Palindrome Linked List.
//Memory Usage: 41.2 MB, less than 95.80% of Java online submissions for Palindrome Linked List.
