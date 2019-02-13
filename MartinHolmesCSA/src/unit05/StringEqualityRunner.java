package unit05;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		String x = "same";
		String y = "different";
		StringEquality egg = new StringEquality(x,y);
		egg.checkEquality();
		System.out.print(egg);
		
		String a = "same";
		String b = "same";
		StringEquality oof = new StringEquality(a,b);
		oof.checkEquality();
		System.out.print(oof);
		
		String c = "same";
		String d = "mase";
		StringEquality no = new StringEquality(c,d);
		no.checkEquality();
		System.out.print(no);
		
	}
}