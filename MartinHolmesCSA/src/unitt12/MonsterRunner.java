package unitt12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Monster 1 name: ");
		String nameOne = keyboard.next();
		System.out.println("Monster 1 size: ");
		int sizeOne = keyboard.nextInt();
		System.out.println("Monster 2 name: ");
		String nameTwo = keyboard.next();
		System.out.println("Monster 2 size: ");
		int sizeTwo = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton monsterOne = new Skeleton(nameOne, sizeOne);
		Skeleton monsterTwo = new Skeleton(nameTwo, sizeTwo);
		//ask for name and size
		
		//instantiate monster two
		if (monsterOne.isBigger(monsterTwo))
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if (monsterOne.isSmaller(monsterTwo))
		{
			System.out.println("Monster one is smaller than Monster two.");
		}
		
		if(monsterOne.namesTheSame(monsterTwo))
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
		else
		{
			System.out.println("Monster one does not have the same name as Monster two.");
		}
	}
}