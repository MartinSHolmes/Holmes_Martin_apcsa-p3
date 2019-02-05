package unit03;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		int x1, y1,x2,y2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("x1 ::");
		x1 = keyboard.nextInt();
		System.out.print("y1 ::");
		y1 = keyboard.nextInt();
		System.out.print("x2 ::");
		x2 = keyboard.nextInt();
		System.out.print("y2 ::");
		y2 = keyboard.nextInt();
		
		Distance d = new Distance();
		d.setCoordinates(x1,y1,x2,y2);
		d.calcDistance();
		System.out.print(d.toString());
	}
}