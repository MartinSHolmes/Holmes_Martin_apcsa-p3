package PictureActivities;

public class Key {
	private int number;
	private String color;
	private int colornumber;
	private boolean up;
	private int upnumber;
	public Key() {
		number = (int) (Math.random()*3+2);
		colornumber = (int) (Math.random()*3);
		upnumber = (int) (Math.random()*2);
		if (colornumber==0) {
			color = "BLUE";
		}
		else if (colornumber==1) {
			color = "RED";
		}
		else {
			color = "GREEN";
		}
		if (upnumber==1) {
			up = true;
		}
		else {
			up = false;
		}
		
	}
	public int Number() {
		return number;
	}
	public String Color() {
		return color;
	}
	public boolean Up() {
		return up;
	}

}
