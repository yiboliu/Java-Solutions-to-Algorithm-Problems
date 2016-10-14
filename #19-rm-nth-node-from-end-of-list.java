/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
		ListNode first = head;
		for(int i = 0; i < n; i++){
			end = end.next;
		}
		if(end == null){
			return first.next;
		}
		while(end.next != null){
			first = first.next;
			end = end.next;
		}
		ListNode linked = first.next.next;
		first.next = linked;
        return head;
    }
}
