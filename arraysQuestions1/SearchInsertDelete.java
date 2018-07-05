package arraysQuestions1;

public class SearchInsertDelete {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 55, 60 };
		int n = arr.length;
		int key = 55;
		int index = findElement(arr, n, key);
		if (index == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element found at index:" + index);
		}

	}

	public static int findElement(int[] arr, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == key)
				return i;
		}

		return -1;
	}

}
