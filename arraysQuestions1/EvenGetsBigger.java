package arraysQuestions1;

import java.util.Scanner;

public class EvenGetsBigger {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		// Write code here

		int x = arr.length - 1;
		int res = Solution(arr, x);
		System.out.println(res);

	}

	public static int Solution(int[] arr, int n) {

		int res = 0;
		int power = 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				

				res = res * power + arr[i];
				if (arr[i] > 10) {

					power = 100;
				} else {
					power = 10;
				}

			}
		}
		return res;

	}
}
