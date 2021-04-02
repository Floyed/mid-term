package com.neu.psa;

import java.util.HashSet;
import java.util.Set;


public class Question1 {

	public static void main(String[] args) {

		ListNode[] inpArray = createDummySeparateListNode();

		System.out.println(areConverging(inpArray[0], inpArray[1]));

		ListNode[] inpArray1 = createDummyConvergingListNode();

		System.out.println(areConverging(inpArray1[0], inpArray1[1]));
	}

	/**
	 * Time Complexity O(n) Space Complexity O(n)
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean areConverging(ListNode n1, ListNode n2) {

		Set<ListNode> set = new HashSet<ListNode>();

		ListNode current = n1;

		while (current != null) {
			set.add(current);
			current = current.next;
		}

		current = n2;

		while (current != null) {

			if (set.contains(current))
				return true;

			current = current.next;
		}

		return false;
	}

	// Inputs

	/**
	 * 
	 * 1-2-3
	 * 
	 * 6-7-8
	 * 
	 */
	public static ListNode[] createDummySeparateListNode() {

		ListNode[] ret = new ListNode[2];

		ListNode li1 = new ListNode(1);

		li1.next = new ListNode(2);
		li1.next.next = new ListNode(3);

		ListNode li = new ListNode(6);

		li.next = new ListNode(7);
		li.next.next = new ListNode(8);

		ret[0] = li1;
		ret[1] = li;
		return ret;
	}

	/**
	 * 
	 *   1-2-3 
	 * 	  / 
	 * 6-7
	 * 
	 */

	public static ListNode[] createDummyConvergingListNode() {

		ListNode[] ret = new ListNode[2];

		ListNode li1 = new ListNode(1);

		li1.next = new ListNode(2);
		li1.next.next = new ListNode(3);

		ListNode li = new ListNode(6);

		li.next = new ListNode(7);
		li.next.next = li1.next;

		ret[0] = li1;
		ret[1] = li;
		return ret;
	}

}
