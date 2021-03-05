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
    private ListNode nextOrNull(ListNode lst) {
        if (lst == null) {
            return null;
        }
        
        return lst.next;
    }
    
    private int add(int sum, ListNode lst) {
        if (lst == null) {
            return sum;
        }
        
        return sum + lst.val;
    }
    
    private ListNode addNodes(ListNode l1, ListNode l2, int odd) {
        if (l1 == null && l2 == null && odd == 0) {
            return null;
        }

        int val = add(add(odd, l1), l2);
        
        return new ListNode(val % 10, addNodes(nextOrNull(l1), nextOrNull(l2), val / 10));
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNodes(l1, l2, 0);
    }
}