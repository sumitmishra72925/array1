package arraysQuestions1;

import java.util.ArrayList;

public class IntersectionOfArray {
	/*given two array find their intersection and return
 	input
 	arr1=10,10,80,90,160
 	arr2=10,10,80,80,160,200,200
 	
 	output
 	 10 10 80 60*/

	public static void main(String[] args) {
		int[] a1 = { 10, 10, 80, 90, 160 };
		int[] a2 = { 10, 10, 80, 80, 160, 200, 220 };
		System.out.println(Intersection(a1, a2));

	}

	public static ArrayList<Integer> Intersection(int[] a1, int[] a2) {
		ArrayList<Integer> al = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] == a2[j]) {
				al.add(a1[i]);
				i++;
				j++;
			}else if(a1[i]<a2[j]){
				i++;
			}else{
				j++;
			}
		}

		return al;
	}

}
