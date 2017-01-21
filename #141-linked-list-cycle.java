/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        Set<ListNode> hm = new HashSet<ListNode>();
		while (head != null) {
			if(hm.contains(head)) return true;
			else hm.add(head);
			head = head.next;
		}
		return false;
    }
}
