/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 1 -> 2 -> 3 -> 4
    2 -> 1     4 -> 3
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return head;
        return swap(head, head.next);
    }
    public ListNode swap(ListNode node1, ListNode node2){
        if(node1== null && node2== null)
            return null;
        if(node1 == null || node2 == null)
        {
            if(node1 == null)
                return node2;
            else
                return node1;
        }
        ListNode op = null;
        if(node2.next != null)
            op = swap(node2.next, node2.next.next);
        node2.next = node1;
        node1.next = op;
        return node2;
    }
}