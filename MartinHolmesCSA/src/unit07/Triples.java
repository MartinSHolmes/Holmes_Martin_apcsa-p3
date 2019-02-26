package unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i <= c; i++) {
			if(a%i==0&&b%i==0&&c%i==0) {
				max=i;
			}
		}

		return max;
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i<number;i++) {
			for(int j=i;j<number;j++) {
				for(int k=j;k<number;k++) {
					if ((i+j)%2==1&&k%2==1&&Math.abs(Math.pow(i,2)+Math.pow(j,2)-Math.pow(k, 2))==0&&greatestCommonFactor(i,j,k)==1){
						output += i + "\t" + j + "\t" + k + "\n";
					}
				}
			}
		}

		return output+"\n";
	}
}