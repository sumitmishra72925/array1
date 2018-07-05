package arraysQuestions1;

import java.util.ArrayList;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 8, 9, 5 };
		int[] arr2 = { 7, 6, 5, 3, 3 };

		System.out.println(sum(arr1, arr2));

	}

	private static ArrayList<Integer> sum(int[] arr1, int[] arr2) {
		ArrayList<Integer> al = new ArrayList<>();

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum += arr1[i];
			}

			if (j >= 0) {
				sum += arr2[j];
			}

			int rem = sum % 10;
			al.add(0, rem);

			carry = sum / 10;

			i--;
			j--;
		}

		if (carry != 0)
			al.add(0, carry);

		return al;
	}
}
