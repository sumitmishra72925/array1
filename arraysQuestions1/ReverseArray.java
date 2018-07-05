package arraysQuestions1;
/*ip>>12345 op>>54321*/

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int n=arr.length;
		reverse(arr,n);

	}

	public static void reverse(int[] arr, int n) {
		int si=0;
		int li=arr.length-1;
		while(si<li){
			 int temp=arr[si];
			 arr[si]=arr[li];
			 arr[li]=temp;
			 si++;
			 li--;
		}
		for(int val:arr){
			System.out.print(val+" ");
		}
		
	}

}
