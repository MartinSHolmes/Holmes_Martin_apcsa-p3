package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);		
	}

	public String getNameOfOldest()
	{
		Dog maximum = pups[0];
		for (Dog dog: pups) {
			if (dog.getAge() > maximum.getAge()) {
				maximum = dog;
			}
		}
		return maximum.getName();
	}

	public String getNameOfYoungest()
	{
		Dog minimum = pups[0];
		for (Dog dog: pups) {
			if (dog.getAge() < minimum.getAge()) {
				minimum = dog;
			}
		}
		return minimum.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}