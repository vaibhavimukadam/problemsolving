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

	public static void productExceptSelf(int[] nums) {
		ArrayList<Integer> leftlist = new ArrayList<>();
		ArrayList<Integer> rightlist = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		leftlist.add(1);
		for (int i = 1; i < nums.length; i++)
			leftlist.add(leftlist.get(i - 1) * nums[i - 1]);
		// System.out.println("left list " + leftlist);
		rightlist.add(1);
		for (int i = nums.length - 1; i > 0; i--)
			rightlist.add(rightlist.get(nums.length - 1 - i) * nums[i]);
		// System.out.println("right list " + rightlist);

		for (int i = 0; i < nums.length; i++)
			list.add(leftlist.get(i) * rightlist.get(nums.length - 1 - i));

		System.out.println("Except self product is " + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 4, 5 };
		System.out.println("Input is  [3,1,2], the output is " + ProdArr(arr1));
		productExceptSelf(arr1);
		
		int arr2[] = { -1, -3, 1, -7 };
		System.out.println("Input is  [-1,-3,1,-7], the output is " + ProdArr(arr2));
		productExceptSelf(arr2);

		int arr3[] = { 3, 2, 1 };
		System.out.println("Input is  [3, 2, 1], the output is " + ProdArr(arr3));
		productExceptSelf(arr3);

	}


}
