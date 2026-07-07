/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode fast = head;
       ListNode low = head;

       while(fast != null && fast.next != null){
        fast = fast.next.next;
        low = low.next;
        if(fast == low) return true;
       }
       return false;
    }
}
