package unit15;

import java.awt.Color;

public class ballextension extends Ball{
	public ballextension() {
        super(200, 200);
        super.setSpeedX(3);
        super.setSpeedY(1);
    }

    public ballextension(int x, int y) {
        super(x, y);
        super.setSpeedX(3);
        super.setSpeedY(1);
    }

    public ballextension(int x, int y, int xs, int ys) {
        super(x, y);
        super.setSpeedX(xs);
        super.setSpeedY(ys);
    }

    public ballextension(int x, int y, int w, int h, Color c) {
        super(x, y, w, h, c);
        super.setSpeedX(3);
        super.setSpeedY(1);
    }
    
    public ballextension(int x, int y, int w, int h, int xs, int ys) {
        super(x, y, w, h);
        super.setSpeedX(xs);
        super.setSpeedY(ys);
    }

    public ballextension(int x, int y, int w, int h, Color c, int xs, int ys) {
        super(x, y, w, h, c);
        super.setSpeedX(xs);
        super.setSpeedY(ys);
    }
    public boolean didCollideTop(Object obj) {
		Block other = (Block)obj;
		return (getY() >= (other.getY() - getHeight() - Math.abs(getYSpeed()))
				&& getY() < (other.getY() + other.getHeight() + Math.abs(getYSpeed())) 
				&& (getX()>=other.getX()
				&& getX()<=(other.getX()+other.getWidth())
				&& (getX()+getWidth())>=other.getX()
				&& (getX()+getWidth())<=other.getX()+other.getWidth()));
	}

	public boolean didCollideBottom(Object obj) {
		Block other = (Block)obj;
		return (getY() > (other.getY() - getHeight() - Math.abs(getYSpeed()))
				&& getY() <= (other.getY() + other.getHeight() + Math.abs(getYSpeed())) 
				&& (getX()>=other.getX()
				&& getX()<=(other.getX()+other.getWidth())
				&& (getX()+getWidth())>=other.getX()
				&& (getX()+getWidth())<=other.getX()+other.getWidth()));
	}
}
