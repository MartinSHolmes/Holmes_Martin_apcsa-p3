package unit09activites;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{		
		ArrayList<Integer> food;
		food = new ArrayList<Integer>();
		for (int i: new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}) food.add(i);
		System.out.println(ListDown.go(food));
		food.clear();
		for (int i: new int[] {10,9,8,7,6,5,4,3,2,1,-99}) food.add(i);
		System.out.println(ListDown.go(food));
		food.clear();
		for (int i: new int[] {10,20,30,40,50,-11818,40,30,20,10}) food.add(i);
		System.out.println(ListDown.go(food));
		food.clear();
		for (int i: new int[] {32767}) food.add(i);
		System.out.println(ListDown.go(food));
		food.clear();
	}
}