package entities;

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle() {

	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AREA= " + String.format("%.2f%n", area()))
		.append("PERIMETER= " + String.format("%.2f%n", perimeter()))
		.append("DIAGONAL= " + String.format("%.2f%n", diagonal()));
		return sb.toString();
	}
}
