package unit08;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum=0;
		int compare = ray[ray.length-1];
		for (int i=0; i<ray.length; i++) {
			if (ray[i]>compare) {
				sum += ray[i];
			}
		}
		if (sum==0) {
			return -1;
		}
		else {
			return sum;
		}
	}
}