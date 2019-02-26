package unit07;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('0');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char lettertwo = letter;
		for(int rows = 0; rows<amount;rows++) {
		for (int column=0;column<amount-rows;column++) {
			for(int letters=amount-column; letters>0;letters--) {
				output += lettertwo;
			}
			output +=" ";
			lettertwo+=1;

		}
		lettertwo=letter;
		output+="\n";
		}
		return output;
	}
}