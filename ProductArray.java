/*Given an array of integers, return a new array such that each element at index i of the new array is the 
 * product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/
import java.io.*;
import java.util.*;

public class ProductArray {
	public static ArrayList<Integer> ProdArr(int[] arr) {
		ArrayList<Integer> list1 = new ArrayList<>();
		int total = 1;
		//Create a variable with total multiplication
		for(int i=0; i<arr.length;i++) {
			total=total*arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			list1.add(total/arr[i]);
		}
		//System.out.println(list1);
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println("Input is  [1,2,3,4,5], the output is "+ ProdArr(arr));
		int arr2[] = {-1,-3,1,-7};
		System.out.println("Input is  [-1,-3,1,-7], the output is "+ ProdArr(arr2));
		int arr3[] = {3,2,1};
		System.out.println("Input is  [3, 2, 1], the output is "+ ProdArr(arr3));

	}

}
