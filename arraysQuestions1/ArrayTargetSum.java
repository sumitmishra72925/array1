package arraysQuestions1;

import java.util.Scanner;

public class ArrayTargetSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int sum = scn.nextInt();
		TargetSum(arr, n, sum);

	}

	public static void TargetSum(int[] arr, int n, int sum) {
		for (int i = 0; i < n - 2; i++) {// loop will be run till n-2 because we
											// have to look for only 3 element
											// at a time
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						System.out.println(arr[i] + " , " + arr[j] + " and " + arr[k]);
					}
				}
			}
		}

	}

}
