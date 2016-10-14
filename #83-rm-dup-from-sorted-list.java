/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
		if(head == null || head.next == null) return result;
		ListNode pointer = head.next;
		if(pointer.next == null){
			if(pointer.val != head.val) return result;
			else{
				head.next = null;
				return result;
			}
		}
		while(pointer.next != null){
			while(head.val != pointer.val){
				head = head.next;
				pointer = pointer.next;
				if(pointer == null){
					return result;
				}
			}
			int temp = pointer.val;
			while(pointer.val == temp){
				pointer = pointer.next;
				if(pointer == null){
					head.next = null;
					return result;
				}
			}
			head.next = pointer;

		}
        return result;
    }
}
