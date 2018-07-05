package arraysQuestions1;
/* given an array find the largest element present in that array
  
  input
  
   array=1,2,5,6,8,9,7,5
    
   output
   
    9*/

import java.util.Scanner;

public class MaxValueInArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int value = MaxValueInarray(arr, n);
		System.out.println(value);
		scn.close();
	}

	public static int MaxValueInarray(int[] arr, int n) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

}
