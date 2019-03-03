package unit08;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		int[] eggArray = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		RayDown egg = new RayDown();
		System.out.println(egg.go(eggArray));
		
		int[] foodArray = {10,9,8,7,6,5,4,3,2,1,-99};
		RayDown food = new RayDown();
		System.out.println(food.go(foodArray));
	}
}