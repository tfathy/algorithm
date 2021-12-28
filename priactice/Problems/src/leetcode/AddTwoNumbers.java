package leetcode;

import leetcode.model.ListNode;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode p = l1, q = l2, curr = result;
		int carry = 0; // if sum >=10 , store the tens digit in carry to be added to sum later. example if sum =10 carry will be 1

		while (p != null || q != null) {
			int pValue = (p != null ? p.val : 0);
			int qValue = (q != null ? q.val : 0);
			int sum = carry + pValue + qValue;
			carry = sum / 10; // decrease sum value
			curr.next = new ListNode(sum % 10); // reminder of the number
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return result.next;

	}

}

/*
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example: 2 -> 4 -> 3 5 -> 6 -> 4
 * 
 * result is: 7 -> 0 -> 8
 * 
 * Explanation: 342 + 465 = 807
 */