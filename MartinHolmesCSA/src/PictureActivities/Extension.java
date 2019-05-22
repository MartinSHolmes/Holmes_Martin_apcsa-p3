package PictureActivities;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Extension extends Picture{
	private Key key;
	public Extension()
	 {
	   super();
	   key = new Key();
	 }
	public Extension(String fileName)
	 {
	   super(fileName);
	   key = new Key();
	 }
	public Extension(int height, int width)
	 {
	   super(width,height);
	   key = new Key();
	 }
	public Extension(Picture copyPicture)
	 {
	   super(copyPicture);
	   key = new Key();
	 }
	public Extension(BufferedImage image)
	 { 
	   super(image);
	   key = new Key();
	 }
	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel otherPixel = null;
		Pixel messagePixel = null;
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = currPixels[row][col];
				if (key.Color().equals("RED")) {
					if (currPixel.getRed()%key.Number()==0) 
						currPixel.setRed(currPixel.getRed()-1);
				}
				if (key.Color().equals("BLUE")) {
					if (currPixel.getBlue()%key.Number()==0) 
						currPixel.setBlue(currPixel.getBlue()-1);
				}
				if (key.Color().equals("GREEN")) {
					if (currPixel.getGreen()%key.Number()==0) 
						currPixel.setGreen(currPixel.getGreen()-1);
				}
			}
		}
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
					currPixel = currPixels[row][col];
					if (key.Up()) {
						if (row<=0) otherPixel = currPixels[row][col];
						else otherPixel = currPixels[row-1][col];
					}
					else {
						if (col<=0) otherPixel = currPixels[row][col];
						else otherPixel = currPixels[row][col-1];
					}
					messagePixel = messagePixels[row][col];
					if (messagePixel.colorDistance(Color.BLACK) < 50) {
						if (key.Color().equals("RED")) {
							while (otherPixel.getRed()%key.Number()!=0) 
								otherPixel.setRed(otherPixel.getRed()+1);
							count++;
						}
						if (key.Color().equals("BLUE")) {
							while (otherPixel.getBlue()%key.Number()!=0) 
								otherPixel.setBlue(otherPixel.getBlue()+1);
							count++;
						}
						if (key.Color().equals("GREEN")) {
							while (otherPixel.getGreen()%key.Number()!=0) 
								otherPixel.setGreen(otherPixel.getGreen()+1);
							count++;
						}
					}
			}
		}
		currPixel = currPixels[this.getHeight()-1][this.getWidth()-1];
		currPixel.setRed(key.Number());
		currPixel = currPixels[this.getHeight()-1][this.getWidth()-2];
		if (key.Color().equals("RED")) {
			currPixel.setRed(200);
		}
		if (key.Color().equals("BLUE")) {
			currPixel.setRed(201);
		}
		if (key.Color().equals("GREEN")) {
			currPixel.setRed(202);
		}
		currPixel = currPixels[this.getHeight()-1][this.getWidth()-3];
		if (key.Up()) {
			currPixel.setRed(200);
		}
		else {
			currPixel.setRed(201);
		}
		System.out.println(key.Number());
		System.out.println(key.Color());
		System.out.println(key.Up());
		System.out.println(count);
	}
	
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;
		Pixel otherPixel = null;
		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height,width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				if (pixels[this.getHeight()-1][this.getWidth()-3].getRed()==200) {
					if (row<=0) otherPixel = pixels[row][col];
					else otherPixel = pixels[row-1][col];
				}
				else {
					if (col<=0) otherPixel = pixels[row][col];
					else otherPixel = pixels[row][col-1];
				}
				messagePixel = messagePixels[row][col];
				if (pixels[this.getHeight()-1][this.getWidth()-2].getRed()==200) {
					if (otherPixel.getRed()%pixels[this.getHeight()-1][this.getWidth()-1].getRed()==0) {
						messagePixel.setColor(Color.BLACK);
						count++;
					}
				}
				if (pixels[this.getHeight()-1][this.getWidth()-2].getRed()==201) {
					if (otherPixel.getBlue()%pixels[this.getHeight()-1][this.getWidth()-1].getRed()==0) {
						messagePixel.setColor(Color.BLACK);
						count++;
					}
				}
				if (pixels[this.getHeight()-1][this.getWidth()-2].getRed()==202) {
					if (otherPixel.getGreen()%pixels[this.getHeight()-1][this.getWidth()-1].getRed()==0) {
						messagePixel.setColor(Color.BLACK);
						count++;
					}
				}
			}
		}
		System.out.println(count);
		return messagePicture;
	}
}
