
package unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect(){
	   setNumber(0);
   }
   public Perfect(int x){
	   setNumber(x);
   }
   public void setNumber(int x){
	   number = x;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		for (int i=1; i<number;i++) {
			if (number%i==0) {
				sum += i;
			}
		}
		
		if (number == sum) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString(){
		boolean oof = isPerfect();
		if (oof) {
			return number + " is perfect";
		}
		else{
			return number + " is not perfect";
		}
	}
	
}