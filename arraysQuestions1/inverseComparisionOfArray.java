package arraysQuestions1;

public class inverseComparisionOfArray {/*give two  array check whether they are inverse of each other  or not return true or false

 input 
 	arr1=1,2,3,4,5,6
 	arr2=6,5,4,3,3,1
 	
 	output
 	true
 	*/

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6,7 };
		int n = arr.length-1;
		
		boolean res = compare(arr, n);
		System.out.println(res);

	}

	public static boolean compare(int[] arr, int n) {
		int[] arr2 = { 7,6, 5, 4, 3, 2, 1 };
		int x=0;
		int y=arr2.length-1;
		while(x!=n && y!=0){
			if(arr[x]==arr2[y]){
				x++;
				y--;
				
			}else{
				return false;
			}
			
		}
		
		return true;
	}

}
