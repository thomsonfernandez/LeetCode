package com.java.main;

public class ReverseNodeInKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		int temp = 0;
		ListNode node = head;
		int firstVal = node.val;
		while(head.next != null) {
			System.out.println("head.val : "+head.val);
			if(head.val == k) {
				temp = k;
				head.val = firstVal;
			}
			head = head.next;
		}
		ListNode lt = new ListNode(temp);
		lt.next = head;
		return lt;
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
}
