package unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Triples test = new Triples(110);
	   System.out.println(test.toString());
	   System.out.println("----------");
	   
	   test.setNum(100);
	   System.out.println(test.toString());
	   System.out.println("----------");
	   
	   test.setNum(90);
	   System.out.println(test.toString());
	   System.out.println("----------");
	   
	   test.setNum(120);
	   System.out.println(test.toString());
	   System.out.println("----------");
	   
	   test.setNum(130);
	   System.out.println(test.toString());
	   System.out.println("----------");
	   
	   test.setNum(200);
	   System.out.println(test.toString());
	   System.out.println("----------");
	}
}