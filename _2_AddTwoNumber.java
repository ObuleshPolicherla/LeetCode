package LeetCode;


public class _2_AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode ans = new ListNode(0);
	        ListNode cur = ans, p=l1, q=l2;
	        int carry = 0;
	        while(p!=null || q!=null){
	            int x = (p!=null) ? p.val:0;
	            int y = (q!=null) ? q.val:0;
	            int sum = carry+x+y;
	            carry = sum/10;
	            cur.next = new ListNode(sum%10);
	            cur = cur.next;
	            if(p!=null) p=p.next;
	            if(q!=null) q=q.next;
	        }
	        if(carry>0){
	            cur.next = new ListNode(carry);
	        }
	        return ans.next;
	    }
	}

}
