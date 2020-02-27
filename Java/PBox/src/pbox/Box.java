package pbox;

public class Box {
	private double height, length, width;
	public Box(double length, double width, double height) {
		getWidth();
		setWidth(width);
		getLength();
		setLength(length);
		getHeight();
		setHeight(height);
		toString();
	}
	public Box(double squareBase, double height) {
		getWidth();
		setWidth(width);
		getLength();
		setLength(length);
		getHeight();
		setHeight(height);
		length = width = squareBase;
		toString();
	}
	public Box(double size) {
		getWidth();
		setWidth(width);
		getLength();
		setLength(length);
		getHeight();
		setHeight(height);
		length = width = height = size;
		toString();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String toString() {
		double volume = length * width * height;
		double surfaceArea = ((2 * length) * width) + ((2 * length) * height) + ((2 * width) * height);
		return "Height : " + height + " Width : " + width + " Length : " + length + " Surface Area : " + surfaceArea + " Volume : " + volume;
	}
}
