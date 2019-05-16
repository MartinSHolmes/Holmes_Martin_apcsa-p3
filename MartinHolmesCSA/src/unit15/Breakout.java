package unit15;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.Character.*;
import java.util.*;
public class Breakout extends Canvas implements KeyListener, Runnable {
	
	private ballextension ball;
	private paddleextension mainPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private boolean played = false;
	
	public Breakout() {
		ball = new ballextension();
		mainPaddle = new paddleextension(400, 300, 40, 40, Color.PINK, 5);
		keys = new boolean[4];
		blocks = new ArrayList<Block>();
    
		drawBlocks();
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		this.addKeyListener(this);		//starts the key thread to log key strokes
		new Thread(this).start();
	}
	public void drawBlocks() {
		//blocks on the left
		for (int x = 5; x < 105; x += 50) {
			for (int y = 5; y < 545; y += 140) {
				blocks.add(new Block(x, y, 45, 130, Color.RED));
			}
		}
		//blocks on top
		for (int x = 105; x < 595; x += 150) {
			for (int y = 5; y < 85; y += 50) {
				blocks.add(new Block(x, y, 135, 45, Color.BLACK));
			}
		}
				
		//blocks on bottom
		for (int x = 105; x < 595; x += 150) {
			for (int y = 505; y > 410; y -= 50) {
				blocks.add(new Block(x, y, 130, 45, Color.BLUE));
			}
		}
				
		//blocks on right
		for (int x = 695; x < 750; x += 50) {
			for (int y = 5; y < 545; y += 140) {
				blocks.add(new Block(x, y, 45, 130, Color.GREEN));
			}
		}
	}
	public void drawBlockstwo() {
		//blocks on the left
		for (int x = 5; x < 85; x += 40) {
			for (int y = 5; y < 600-55; y += 80) {
				blocks.add(new Block(x, y, 35, 75, Color.RED));
			}
		}
		//blocks on top
		for (int x = 85; x < 675; x += 80) {
			for (int y = 5; y < 85; y += 40) {
				blocks.add(new Block(x, y, 75, 35, Color.BLACK));
			}
		}
				
		//blocks on bottom
		for (int x = 85; x < 675; x += 80) {
			for (int y = 525; y > 445; y -= 40) {
				blocks.add(new Block(x, y, 75, 35, Color.BLUE));
			}
		}
				
		//blocks on right
		for (int x = 725; x < 800; x += 40) {
			for (int y = 5; y < 600-55; y += 80) {
				blocks.add(new Block(x, y, 35, 75, Color.GREEN));
			}
		}
	}
	public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        //set up the double buffering to make the game animation nice and smooth
        Graphics2D twoDGraph = (Graphics2D) window;

        //take a snap shop of the current screen and same it as an image
        //that is the exact same width and height as the current screen
        if (back == null) {
            back = (BufferedImage) (createImage(getWidth(), getHeight()));
        }

        //create a graphics reference to the back ground image
        //we will draw all changes on the background image
        Graphics graphToBack = back.createGraphics();

        ball.moveAndDraw(graphToBack);
        mainPaddle.draw(graphToBack);
        for (Block b: blocks) {
			b.draw(graphToBack);
		}
        //handle if either paddle goes out of bounds
        if(!(mainPaddle.getY() >= 0 && mainPaddle.getY() + mainPaddle.getHeight() <= 600)){
        	mainPaddle.remPad(window);
        	mainPaddle.setY(600 - mainPaddle.getY());
        }
        if(!(mainPaddle.getX() >= 0 && mainPaddle.getX() + mainPaddle.getHeight() <= 800)){
        	mainPaddle.remPad(window);
        	mainPaddle.setX(800 - mainPaddle.getY());
        }
        //see if ball hits left wall or right wall
        if(ball.getX()<0)
		{
			ball.setXSpeed(Math.abs(ball.getXSpeed()));
		}
		else if (ball.getX() > getWidth()) {
			ball.setXSpeed(-1*Math.abs(ball.getXSpeed()));
		}
        //see if the ball hits the top or bottom wall 
        if (!(ball.getY() >= 0 && ball.getY() <= window.getClipBounds().height - ball.getHeight())) {
            ball.setXSpeed(ball.getXSpeed());
            ball.setYSpeed(-ball.getYSpeed());
        }
        //see if the ball hits the paddle
        if (ball.didCollideLeft(mainPaddle)) 
		{
        	ball.setXSpeed(-ball.getXSpeed());
		}
		else if (ball.didCollideRight(mainPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		else if (ball.didCollideBottom(mainPaddle)) 
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		else if (ball.didCollideTop(mainPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		//check if ball hits any of the blocks
		for(int i = 0; i < blocks.size(); i++){
			Block b = blocks.get(i);
			//collides on top
			if(ball.didCollideTop(b)){
						ball.setYSpeed(-ball.getYSpeed());
						disappear(b, i, graphToBack);
					}
			//collides on bottom
			if(ball.didCollideBottom(b)){
						ball.setYSpeed(-ball.getYSpeed());
						disappear(b, i, graphToBack);
				}
			//collides on left side
			if(ball.didCollideLeft(b)){
						ball.setXSpeed(-ball.getXSpeed());
						disappear(b, i, graphToBack);
					}
					
			//collides on right side
			if(ball.didCollideRight(b)){
						ball.setXSpeed(-ball.getXSpeed());
						disappear(b, i, graphToBack);
					}		
				}
        //see if the paddles need to be moved
        if (keys[0] == true) {
        	mainPaddle.moveUpAndDraw(graphToBack);
        }
        if (keys[1] == true) {
        	mainPaddle.moveDownAndDraw(graphToBack);
        }
        if (keys[2] == true) {
        	mainPaddle.moveLeftandDraw(graphToBack);
        }
        if (keys[3] == true) {
        	mainPaddle.moveRightandDraw(graphToBack);
        }

        twoDGraph.drawImage(back, null, 0, 0);
    }
    public void disappear(Block b, int pos, Graphics window)
    {
    	b.draw(window, Color.WHITE);
    	b.setHeight(0);
    	b.setWidth(0);
    	blocks.remove(pos);
    	
    	if(isEmpty())
    	{
    		ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(window, Color.WHITE);
    		
			mainPaddle.draw(window, Color.WHITE);
			
			mainPaddle.setX(400);
			mainPaddle.setY(300);
    		ball.setX(30);
    		ball.setY(50);
    		ball.setXSpeed(5);
    		ball.setYSpeed(2);
    		drawBlockstwo();
    	}
    }
    public boolean isEmpty()
    {
    	return(blocks.size() == 0);
    }
    public void keyPressed(KeyEvent e) {
        switch (toUpperCase(e.getKeyChar())) {
            case 'W':
                keys[0] = true;
                break;
            case 'S':
                keys[1] = true;
                break;
            case 'A':
                keys[2] = true;
                break;
            case 'D':
                keys[3] = true;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (toUpperCase(e.getKeyChar())) {
            case 'W':
                keys[0] = false;
                break;
            case 'S':
                keys[1] = false;
                break;
            case 'A':
                keys[2] = false;
                break;
            case 'D':
                keys[3] = false;
                break;
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(8);
                repaint();
            }
        } catch (Exception e) {
        }
    }
}
