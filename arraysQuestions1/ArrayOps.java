package arraysQuestions1;

public class ArrayOps {

	public static void main(String[] args) {
	

		int[] arr;
		arr = new int[5];

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[0]);

		// 1 way
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// 2 way
		for (int val : arr) {
			System.out.print(val + " ");

		}

		int i = 0, j = 2;

		// non working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

		// working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		int[] other = { 100, 200, 300 };
		System.out.println(arr[0] + ", " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);
	}

	public static void Swap(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
	}

	public static void Swap(int[] arr1, int i, int j) {
		System.out.println(arr1[i] + ", " + arr1[j]);

		int temp = arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;

		System.out.println(arr1[i] + ", " + arr1[j]);
	}

	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

}
