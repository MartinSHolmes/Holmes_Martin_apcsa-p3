package unit08;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{

	public static int go(int[] ray)
	{
		int odd=-1;
		int even=-1;
		for(int i=0;i<ray.length;i++) {
			if (ray[i]%2==1) {
				odd = i;
				break;
			}
		}
		for (int y=odd+1;odd<ray.length;y++) {
			if (ray[y]%2==0) {
				even = y;
				break;
			}
		}
		if (odd==-1||even==-1) {
			return -1;
		}
		else {
			return even-odd;
		}
	}
}