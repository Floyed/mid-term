package com.neu.psa;

public class Question4 {

	public static void main(String[] args) {

		int[] inp = new int[] { 2, 4, 7, 7, 7, 8, 9, 9 };
		int[] inp1 = new int[] { 1, 7, 7, 7, 7, 8, 9, 9 };
		int[] inp2 = new int[] { 2, 4, 7, 7, 7, 8, 9, 9 };
		int[] inp3 = new int[] { 2, 4, 7, 7, 7, 8, 9, 9 };
		int[] inp4 = new int[] {};

		System.out.println(getFirstIndex(inp, 7));
		System.out.println(getFirstIndex(inp1, 2));
		System.out.println(getFirstIndex(inp2, 8));
		System.out.println(getFirstIndex(inp3, 9));
		System.out.println(getFirstIndex(inp4, 9));
	}

	/**
	 * Time Complexity O(log n) Space Complexity O(1)
	 * 
	 * @param nums input array
	 * @param x    Key to search
	 * @return -1 if key not present
	 * @return index for first occurrence
	 */
	public static int getFirstIndex(int[] nums, int x) {

		int left = 0, right = nums.length - 1;

		while (left <= right) {

			if (nums[left] == x)
				return left;

			int mid = (left + right) / 2;

			if (nums[mid] > x) {
				right = mid - 1;
			} else if (nums[mid] < x) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		return -1;
	}
}
