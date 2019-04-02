/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean firstDigit = true;
        int temp = 0;
        int carry = 0;
        ListNode toReturn = new ListNode(0);
        ListNode currNode = new ListNode(0);
        ListNode oneCurr = l1;
        ListNode twoCurr = l2;
        while(oneCurr != null || twoCurr != null){
            int firstNode = 0;
            int secondNode = 0;
            if(oneCurr != null){
                firstNode = oneCurr.val;
            }
            else{
                firstNode = 0;
            }
            if(twoCurr != null){
                secondNode = twoCurr.val;
            }
            else{
                secondNode = 0;
            }
            temp = firstNode + secondNode;
            if(carry == 1){
                temp += 1;
                carry = 0;
            }
            if (temp >= 10){
                carry = 1;
            }
            int digit = temp % 10;
            if(firstDigit){
                toReturn = new ListNode(digit);
                currNode = toReturn;
                firstDigit = false;
            }
            else{
                if(currNode != null){
                    currNode.next = new ListNode(digit);
                    currNode = currNode.next;
                }
            }
            if(oneCurr != null){
                oneCurr = oneCurr.next;
            }
            if(twoCurr != null){
                twoCurr = twoCurr.next;
            }
            if(oneCurr == null && twoCurr == null){
                if(carry == 1){
                    currNode.next = new ListNode(1);
                }
            }
            
        }
        return toReturn;        
    }
    
}


//Results:
//Runtime: 2 ms, faster than 98.98% of Java online submissions for Add Two Numbers.
//Memory Usage: 46.4 MB, less than 52.42% of Java online submissions for Add Two Numbers.
