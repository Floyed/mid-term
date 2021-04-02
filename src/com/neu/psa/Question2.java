package com.neu.psa;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		TreeNode inp = generateTree();
		printPerimeter(inp);
	}

	/**
	 * Time Complexity O(n) Space Complexity O(1)
	 */
	public static void printPerimeter(TreeNode root) {

		printRightNodes(root);
		printLeafNodes(root);
		printLeftNodes(root);

	}

	
	public static void printRightNodes(TreeNode root) {

		if (root == null)
			return;

		if (root.right == null && root.left == null) {
			return;
		}
		System.out.println(root.val + " ");

		printRightNodes(root.right);

	}

	public static void printLeafNodes(TreeNode root) {

		if (root == null)
			return;

		if (root.right == null && root.left == null) {
			System.out.println(root.val + " ");
			return;
		}

		printLeafNodes(root.right);
		printLeafNodes(root.left);

	}

	public static void printLeftNodes(TreeNode root) {

		if (root == null)
			return;

		if (root.right == null && root.left == null) {
			return;
		}

		printRightNodes(root.left);
		
		System.out.println(root.val + " ");

	}

	/**
	 * 		 1
	 * 		 /\
	 * 		2  3
	 *     /\  /\
	 *     4 5 6 7
	 * 
	 */
	public static TreeNode generateTree() {

		TreeNode one = new TreeNode(1);

		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);

		one.left = two;
		one.right = three;

		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);

		two.left = four;
		two.right = five;

		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);

		three.left = six;
		three.right = seven;

		return one;
	}

}
