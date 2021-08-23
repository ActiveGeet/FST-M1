package activities;

public class Bicycle implements BicycleParts, BicycleOperation {

	public int gears;
	public int speed;
	
	public Bicycle(int gears, int speed) {
		this.gears = gears;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
		System.out.println("Current Decreased Speed: "+speed);
	}
	
	public void speedUp(int increment) {
		speed += increment;
		System.out.println("Current Incresed Speed: "+speed);
	}

	public String bicycleDesc() {
        return("Number of gears in bicycle is "+ gears + " and Speed is " + speed);
    }
}