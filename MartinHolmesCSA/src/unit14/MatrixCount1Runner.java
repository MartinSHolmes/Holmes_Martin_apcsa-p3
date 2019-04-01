package unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		System.out.println("Matrix values");
		
		MatrixCount1.print();
		
		System.out.println("The 1 count is :: " + MatrixCount1.count(1));
		System.out.println("The 4 count is :: " + MatrixCount1.count(4));
		System.out.println("The 6 count is :: " + MatrixCount1.count(6));
		System.out.println("The 30 count is :: " + MatrixCount1.count(30));
	}
}


