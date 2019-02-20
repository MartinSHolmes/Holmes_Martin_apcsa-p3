package unit06;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover good = new LetterRemover("I am Sam I am",'a');
		System.out.print(good);
		
		LetterRemover bada = new LetterRemover("ssssssssxssssesssssesss",'s');
		System.out.print(bada);
											
	}
}