package unit09activites;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd=-1;
		int even=-1;
		for (int i =0; i<ray.size();i++) {
			if (ray.get(i)%2==1) {
				odd = i;
				break;
			}
		}
		if (odd==-1) {
			return -1;
		}
		for (int j=ray.size()-1;j>even;j--) {
			if (ray.get(j)%2==0) {
				even = j;
				break;
			}
		}
		if (even==-1) {
			return -1;
		}
		return even-odd;
	}
}