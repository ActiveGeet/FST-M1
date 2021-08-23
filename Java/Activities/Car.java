package activities;

public class Car {
	//Variables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	//Constructor
	Car() {
		tyres = 4;
		doors = 4;
	    }
	
	//Methods
	public void displayCharacteristics() {
		//displays the values of all the variables
		System.out.println("Color of Car : "+color);
		System.out.println("Transmission of Car : "+transmission);
		System.out.println("Make of Car : "+make);
		System.out.println("Tyres of Car : "+tyres);
		System.out.println("Doors of Car : "+doors);
	}
	
	
	public void accelarate() {
		//prints "Car is moving forward."
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		//prints "Car has stopped."
		System.out.println("Car has stopped.");
	}
}
