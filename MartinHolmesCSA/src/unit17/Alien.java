//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package unit17;
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean right;

	public Alien()
	{
		this(0,0,30,30,0);
		right = true;
	}

	public Alien(int x, int y)
	{
		super(x, y);
		right = true;
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		right = true;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		right = true;
		try
		{
			//URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(new File("src/alien.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("error alien");
		}
	}

	public void setSpeed(int s)
	{
		speed=s;
	}

	public int getSpeed()
	{
		return speed;
	}

   public void move(String direction)
	{
	   if(direction.equals("LEFT")){
			if(getX() > 0){
				setX(getX() - getSpeed());
			}
		}
		else if(direction.equals("RIGHT")){
			if(getX() + getWidth() < 800){
				setX(getX() + getSpeed());
			}
		}
		else if(direction.equals("UP")){
			if(getY() > 0){
				setY(getY() - getSpeed());
			}
		}
		else if(direction.equals("DOWN")){
			if(getY() + getHeight() < 580){
				setY(getY() + getSpeed());
			}
		}
	}
   
   	public void setRight(boolean b) 
  	{
  		right = b;
  	}
  	
  	public boolean goingRight()
  	{
  		return right;
  	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
