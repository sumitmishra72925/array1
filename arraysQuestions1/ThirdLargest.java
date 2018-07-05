package arraysQuestions1;

import java.util.Arrays;
import java.util.*;

public class ThirdLargest {/*
 		given an array find the third largest element present in array
 		
 		input
 		 
 		 arr=5,8,9,7,10,12
 		 
 		 output
 		 
 		 9
 		 */

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    int n= scn.nextInt();
	    int [] arr= new int [n];
	    for(int i=0;i<n;i++){
	        arr[i]=scn.nextInt();
	    }
	    	//Write code here
	    	
			int x= arr.length - 1;
			int res = Solution(arr, x);
			System.out.println(res);

	   }
	   public static int Solution(int[] arr, int n) {
			Arrays.sort(arr);
		
			int res=arr[n-2];
			return res;
		}

	}
