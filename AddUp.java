//Easy

/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
*/
import java.io.*;
import java.util.*;

public class AddUp {

	public static void addCheck(int arr[], int k) {
		// create ArrayList list1
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i =0; i<arr.length;i++)
			list1.add(arr[i]);
		
		for(int i=0; i<list1.size();i++) {
			int num = list1.get(i);
			if (list1.contains(k - num)){//to be noted that contains() complexity is O(n)
				System.out.println(num + " + "+ (k - num)+" is " +k);
				break;
				}
			if(i==list1.size()-1)
				System.out.println("Not Present");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create ArrayList list2
		int arr[] = {10,3,15,7};
		addCheck(arr, 14);
		int arr2[] = {-1,-3,1,-7};
		addCheck(arr2, 0);
		
	}

}
//Testing:
  //negative numbers
  //positive numbers
  //self
