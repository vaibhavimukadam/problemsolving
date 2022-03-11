import java.util.ArrayList;
import java.math.*;

/*Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.
Examples:  
Input: arr[]   = {2, 0, 2}
Output: 2
Input: arr[]   = {3, 0, 2, 0, 4}
Output: 7
*/
public class WaterTrapProblem {

	public static ArrayList<Integer> left(ArrayList<Integer> list1) {
		ArrayList<Integer> maxleft = new ArrayList<>();
		maxleft.add(list1.get(0));
		for (int i = 1; i < list1.size(); i++) {
			if (list1.get(i) > maxleft.get(i - 1))
				maxleft.add(list1.get(i));
			else
				maxleft.add(maxleft.get(i - 1));
		}

		return maxleft;

	}

	public static ArrayList<Integer> right(ArrayList<Integer> list1) {
		ArrayList<Integer> maxright = new ArrayList<>();
		maxright.add(list1.get(list1.size() - 1));
		for (int i = list1.size() - 1; i > 0; i--) {
			if (list1.get(i) > maxright.get(list1.size() - 1 - i))
				maxright.add(list1.get(i));
			else
				maxright.add(maxright.get(list1.size() - 1 - i));
		}
		return maxright;
	}

	public static int countWater(int[] arr) {
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
			list1.add(arr[i]);
		System.out.println(list1);

		ArrayList<Integer> maxleft = left(list1);
		ArrayList<Integer> maxright = right(list1);
		int count = 0;
		for (int i = 0; i < list1.size() - 1; i++) {
			int min = Math.min(maxleft.get(i), maxright.get(maxright.size() - 1 - i));
			count = count + ((list1.get(i) >= min) ? 0 : min - list1.get(i));
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 3, 0, 2 };
		int arr2[] = { 0, 2, 0, 4, 0, 2 };
		int arr3[] = { 3, 0, 2, 0, 4 };

		System.out.println("Output is " + countWater(arr1));
		System.out.println("");
		System.out.println("Output is " + countWater(arr2));
		System.out.println("");
		System.out.println("Output is " + countWater(arr3));

	}

}
