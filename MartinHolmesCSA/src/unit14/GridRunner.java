package unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] grid = {"m", "x", "3", "10", "1"};
		Grid test = new Grid(10, 9, grid);
		
		System.out.println(test);
		
		System.out.println(test.findMax(grid));
	}
}