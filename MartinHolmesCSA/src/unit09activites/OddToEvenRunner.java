package unit09activites;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> food;
		food = new ArrayList<Integer>();
		for (int i: new int[] {7,1,5,3,11,5,6,7,8,9,10,12345,11}) food.add(i);
		System.out.println(ListOddToEven.go(food));
		food.clear();
		for (int i: new int[] {11,9,8,7,6,5,4,3,2,1,-99,7}) food.add(i);
		System.out.println(ListOddToEven.go(food));
		food.clear();
		for (int i: new int[] {10,20,30,40,5,41,31,20,11,7}) food.add(i);
		System.out.println(ListOddToEven.go(food));
		food.clear();
		for (int i: new int[] {2,4,6,8,8}) food.add(i);
		System.out.println(ListOddToEven.go(food));
		food.clear();
	}
}