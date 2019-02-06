package unit04;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		int x;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input number :: ");
		x = keyboard.nextInt();
		
		//add in input
		System.out.println(x + " is odd :: " + NumberVerify.isOdd(x));
		System.out.println(x + " is even :: " + NumberVerify.isEven(x));
		System.out.println("---------------------------");
		System.out.println("7 is odd :: " + NumberVerify.isOdd(7));
		System.out.println("7 is even :: " + NumberVerify.isEven(7));
		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("6 is even :: " + NumberVerify.isEven(6));
		System.out.println("10 is odd :: " + NumberVerify.isOdd(10));
		System.out.println("10 is even :: " + NumberVerify.isEven(10));
		
		//add in more test cases
	}
}