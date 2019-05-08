package unit15;
import java.awt.*;
public class paddleextension extends Paddle {

	public paddleextension() {
		super ();
	}
	public paddleextension(int x, int y){
		super(x,y);
		super.setSpeed(5);
	}
	public paddleextension(int x, int y, int spd){
		super (x,y);
		super.setSpeed(spd);
	}
	public paddleextension(int x, int y, int wid, int ht){
		super (x,y,wid,ht);
		super.setSpeed(5);
	}
	public paddleextension(int x, int y, int wid, int ht,int spd){
		super (x,y, wid,ht);
		super.setSpeed(spd);
	}
	public paddleextension(int x, int y, int wid, int ht, Color col, int spd){
		super(x,y,wid,ht,col,spd);
	}
	public void moveRightandDraw(Graphics window) {
		draw(window,Color.WHITE);
		setX(getX()+super.getSpeed());
		draw(window);
	}
	public void moveLeftandDraw(Graphics window) {
		draw(window,Color.WHITE);
		setX(getX()-super.getSpeed());
		draw(window);
	}
}
