package unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice= "";
		compChoice="";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		
	}

	public void setPlayers(String player)
	{
		playChoice= player;
		int ran = new Random().nextInt(3);
		switch(ran) {
		
		case 0:
			compChoice = "R";
			break;
		case 1: 
			compChoice = "P";
			break;
		case 2:
			compChoice ="S";
			break;
		
		}
			
		
		
		
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals(compChoice))
		{
			winner =  "Draw";
		}
		else if((playChoice.equals("R")&&compChoice.equals("P"))||(playChoice.equals("P")&&compChoice.equals("S"))|| (playChoice.equals("S")&&compChoice.equals("R")))
		{
			winner =  "Computer";
		}
		else if(playChoice.equals("P")&&compChoice.equals("R")||playChoice.equals("S")&&compChoice.equals("P")|| playChoice.equals("R")&&compChoice.equals("S"))
		{
			winner = "Player";

		}
			
			
			
			
			
		return winner;
	}

	public String toString()
	{
		String winner = determineWinner();
		String output="";
		System.out.println("Player had "+playChoice);
		System.out.println("Computer had "+compChoice);
		if(winner.equals("Draw"))
		{
			output = "!"+winner+"!";
		}
		else if(winner.equals("Computer")){
			output = "!"+winner+"wins <<"+ compChoice+ " Covers "+playChoice+ ">>!";
		}
		else if(winner.equals("Player"))
		{
			output = "!"+winner+"wins <<"+ playChoice+ " Covers "+compChoice+ ">>!";

		}

		return output;
	}
}