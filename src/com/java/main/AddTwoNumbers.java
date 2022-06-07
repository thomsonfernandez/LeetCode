package com.java.main;

// A Java recursive program to add two linked lists

public class AddTwoNumbers
{
	public ListNode resList = new ListNode(0);
	public ListNode head = resList;
	public int carry = 0;

	private class ListNode {
		private int value;
		private ListNode next;

		public ListNode(int value) {
			this.value = value;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
		int sum = l1.value + l2.value + carry;
		carry  = sum / 10;
		resList.next = new ListNode(sum % 10);
		resList = resList.next;

		if(l1.next != null && l2.next != null)
			addTwoNumbers(l1.next, l2.next);  
		else if (l1.next != null)
			addTwoNumbers(l1.next, new ListNode(0)); 
		else if (l2.next != null)
			addTwoNumbers(new ListNode(0), l2.next);   
		else if (carry > 0)
		{
			resList.next = new ListNode(1);
			resList = resList.next;
		}     
		return head.next;
	}
}

