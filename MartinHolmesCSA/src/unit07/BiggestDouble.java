package unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=d;
	}

	public double getBiggest()
	{
		double number=0;
		if (one>=two) {
			if (one>=three) {
				if (one>=four) {
					number = one;
				}
				else {
					number = four;
				}
			}
			else {
				if (three>=four) {
					number = three;
				}
				if (four>three) {
					number = four;
				}
			}
			
		}
		if (two>one) {
			if (two>=three) {
				if (two>=four) {
					number = one;
				}
				else {
					number = four;
				}
			}
			else {
				if (three>=four) {
					number = three;
				}
				if (four>three) {
					number = four;
				}
			}
			
		}
		return number;
	}

	public String toString()
	{
	   return "The biggest double is " + getBiggest();
	}
}