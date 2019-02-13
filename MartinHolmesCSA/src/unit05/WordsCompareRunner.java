package unit05;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   String x = "add";
	   String y = "study";
	   WordsCompare egg = new WordsCompare(x,y);
	   egg.compare();
	   System.out.print(egg);
	   
	   String a = "food";
	   String b = "gad";
	   WordsCompare google = new WordsCompare(a,b);
	   google.compare();
	   System.out.print(google);
	   
	   String c = "good";
	   String d = "bad";
	   WordsCompare toodle = new WordsCompare(c,d);
	   toodle.compare();
	   System.out.print(toodle);
	}
}