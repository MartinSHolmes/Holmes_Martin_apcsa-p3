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
							currPixel.setRed(otherPixel.getRed() + key.Number());
							count++;
						}
						if (key.Color().equals("GREEN")) {
							currPixel.setGreen(otherPixel.getGreen() + key.Number());
							count++;
						}
						if (key.Color().equals("BLUE")) {
							currPixel.setBlue(otherPixel.getBlue() + key.Number());
							count++;
						}
					}
			}
		}
		System.out.println(count);
		System.out.println(key.Number());
		System.out.println(key.Color());
		System.out.println(key.Up());
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
				if (key.Up()) {
					if (row<=0) otherPixel = pixels[row][col];
					else otherPixel = pixels[row-1][col];
				}
				else {
					if (col<=0) otherPixel = pixels[row][col];
					else otherPixel = pixels[row][col-1];
				}
				messagePixel = messagePixels[row][col];
				if (key.Color().equals("RED")) {
					if (currPixel.getRed() - otherPixel.getRed() == key.Number()) {
						messagePixel.setColor(Color.BLACK);
						count++;
					}
				}
				if (key.Color().equals("GREEN")) {
					if (currPixel.getGreen() - otherPixel.getGreen() == key.Number()) {
						messagePixel.setColor(Color.BLACK);
						count++;
					}
				}
				if (key.Color().equals("BLUE")) {
					if (currPixel.getBlue() - otherPixel.getBlue() == key.Number()) {
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
