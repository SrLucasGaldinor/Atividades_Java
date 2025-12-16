package entities;

public class Person {

	private double height;
	private String gender;
	
	public Person() {

	}

	public Person(double height, String gender) {
		this.height = height;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public String getGender() {
		return gender;
	}
}
