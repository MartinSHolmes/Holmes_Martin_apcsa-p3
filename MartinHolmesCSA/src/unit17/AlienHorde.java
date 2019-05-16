//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package unit17;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		int x = 0;
		int y = 5;
		for (int i=0; i<size; i++)
		{
			
			x -= 40;
			aliens.add(new Alien(x, y, 50, 50, 2));
			
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a: aliens)
		{
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a: aliens) 
		{
			if (a.goingRight()) 
			{
				if (a.getX() > 740) 
				{
					a.setRight(false);
					for (int down = 0; down < 30; down++) a.move("DOWN");
				}
				else {
					a.move("RIGHT");
				}
			}
			else {
				if (a.getX() < 60) {
					a.setRight(true);
					for (int down = 0; down < 30; down++) a.move("DOWN");
				}
				else {
					a.move("LEFT");
				}
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int j = 0; j < shots.size(); j++)
		{
			for(int i = 0; i < aliens.size(); i++)
			{
				if(shots.get(j).getY() - shots.get(j).getSpeed() <= aliens.get(i).getY() + aliens.get(i).getHeight()
					&& shots.get(j).getX() >= aliens.get(i).getX() 
					&& shots.get(j).getX() + shots.get(j).getWidth() <= aliens.get(i).getX() + aliens.get(i).getWidth())
				{
					aliens.remove(i);
					shots.remove(j);
					if(aliens.size() < 1 || shots.size() < 1) break;
				}
			}
		}
	}

	public boolean gameIsWon()
	{
		return (aliens.size() == 0);
	}
	
	public void Slow()
	{
		for (Alien al : aliens)
		{
			al.setSpeed(0);
		}
	}
	
	public boolean touchingShip(Graphics window, Ship ship)
	{
		boolean touching = false;
		for (Alien al : aliens)
		{
			if ( (al.getX() + al.getWidth() + Math.abs(al.getSpeed()) >= ship.getX() 
					&& al.getX() <= ship.getX()
					&& al.getY() >= ship.getY() 
					&& al.getY() + al.getHeight() <= ship.getY() + ship.getHeight()) 
				|| (al.getX() - Math.abs(al.getSpeed()) <= ship.getX() + ship.getWidth() 
					&& al.getX() >= ship.getX()
					&& al.getY() >= ship.getY() 
					&& al.getY() + al.getHeight() <= ship.getY() + ship.getHeight()
				|| (ship.getY() - Math.abs(ship.getSpeed()) <= al.getY() + al.getHeight() 
					&& al.getY() < ship.getY()
					&& al.getX() >= ship.getX() 
					&& al.getX() + al.getWidth() <= ship.getX() + ship.getWidth())
				|| (al.getY() <= ship.getY() + ship.getHeight() + Math.abs(ship.getSpeed()) 
					&& al.getY() > ship.getY()
					&& al.getX() >= ship.getX() 
					&& al.getX() + al.getWidth() <= ship.getX() + ship.getWidth())) )
			{
				touching = true;
			}
		}
		return touching;
	}
	
	public String toString()
	{
		return "";
	}
}
