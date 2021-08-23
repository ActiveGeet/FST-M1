package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.color = "Black";
		car.transmission = "Automatic";
		car.make = 2019;
		
		car.displayCharacteristics();
		car.accelarate();
		car.brake();
	}

}
