package parrays;

import java.util.Random;

public class Balloon {
	private int colour;
	public Balloon() {
		getColour();
	}
	
	public int getColour() {
		Random rand = new Random();
		colour = rand.nextInt(10);
		return colour;
	}

	public String writeColour(int colour){
		String written = "";
		switch(colour) {
		case 1:
			written = "Red";
			break;
		case 2:
			written = "Blue";	
			break;
		case 3:
			written = "Green";
			break;
		case 4:
			written = "Yellow";
			break;
		case 5:
			written = "Orange";
			break;
		case 6:
			written = "Purple";
			break;
		case 7:
			written = "White";
			break;
		case 8:
			written = "Grey";
			break;
		case 9:
			written = "Black";
			break;
		case 10:
			written = "Magenta";
			break;
		default:
			written = "Rainbow";
			break;
		}
		return written;
	}
}
