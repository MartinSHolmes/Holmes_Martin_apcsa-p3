package unit01;
//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	  out.println("********************");
   }

   public void printTwentyDashes()
   {
	  out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println();
	   out.println();
   }
   
   public void printASmallBox()
   {	
	   out.println(" ______ ");
	   out.println("|      |");
	   out.println("|      |");
	   out.println("|      |");
	   out.println(" ______");
   }
 
   public void printABigBox()
   { 	
	   out.println(" __________ ");
	   out.println("|          |");
	   out.println("|          |");
	   out.println("|          |");
	   out.println("|          |");
	   out.println("|          |");
	   out.println(" __________ ");
   }   
   
   public void printAStar()
   { 	
	   out.println("     +");
	   out.println("    + +");
	   out.println("   +   +");
	   out.println("    + +");
	   out.println("     +");
   }   
}