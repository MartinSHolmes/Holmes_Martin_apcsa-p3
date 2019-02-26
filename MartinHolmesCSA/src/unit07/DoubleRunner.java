package unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
		
		BiggestDouble stop = new BiggestDouble(1.2, 3.4, 5.6, 7.8);
		System.out.println(stop);
		
		stop.setDoubles(14.51,6.17,71.8,1.0);
		System.out.println(stop);
		
		stop.setDoubles(884.5,16.7,7.8,9.0);
		System.out.println(stop);
				
	}
}