package com.neu.psa;

public class Question3 {

	public static void main(String[] args) {

		int[] inp = new int[] { 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0 }; // 3
		int[] inp1 = new int[] { 0, 1, 0, 1, 0 }; // 1
		int[] inp2 = new int[] { 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1 }; // 6
		int[] inp3 = new int[] { 0, 0, 0, 0, 0, 0, 0 }; // 0
		int[] inp4 = new int[] { 1, 1, 1, 1, 1, 1 }; // 6
		int[] inp5 = new int[] {}; // 0

		System.out.println(getMaxConsecutiveOnes(inp));
		System.out.println(getMaxConsecutiveOnes(inp1));
		System.out.println(getMaxConsecutiveOnes(inp2));
		System.out.println(getMaxConsecutiveOnes(inp3));
		System.out.println(getMaxConsecutiveOnes(inp4));
		System.out.println(getMaxConsecutiveOnes(inp5));

	}

	/**
	 * Time Complexity O(n) Space Complexity O(1)
	 * 
	 * @param nums input array containing 1's and 0's
	 * @return max continuous count
	 */
	public static int getMaxConsecutiveOnes(int[] nums) {

		int max = 0;
		int prev = -1, currentCount = 0;

		for (int i : nums) {

			if (i == 1) {
				if (prev == 1) {
					currentCount++;
				} else {
					prev = 1;
					currentCount = 1;
				}
			} else {
				prev = 0;
				currentCount = 0;
			}

			max = Math.max(max, currentCount);
		}

		return max;
	}
}
