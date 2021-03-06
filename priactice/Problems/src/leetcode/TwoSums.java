package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

	public static void main(String[] args) {
		int[] intArray = { 2, 9, 7, 15, 3, 1, 5, 8 };
		TwoSums s = new TwoSums();
		int[] sums = s.towSums(intArray, 9);

		System.out.println(Arrays.toString(sums));

	}

	int[] towSums(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No Two sums solutions");
	}

}

/*
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

example
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,3], target = 6
Output: [0,1]

 * */
