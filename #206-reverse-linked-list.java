/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pointer = head;
        ListNode result = head;
        ArrayList<Integer> values = new ArrayList<Integer>();
        while(head != null){
        	values.add(head.val);
        	head = head.next;
        }
        for(int i = 0; i < values.size(); i++){
        	pointer.val = values.get(values.size() - 1 - i);
        	pointer = pointer.next;
        }
        return result;
    }
}
