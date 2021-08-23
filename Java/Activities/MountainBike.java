package activities;

public class MountainBike extends Bicycle {
	public int seatHeight;
	
	public MountainBike(int gears, int speed, int startHeight) {

		super(gears, speed);
        seatHeight = startHeight;
    }
	
	public void setHeight(int height) {
        seatHeight = height;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ " and Seat height is " + seatHeight);
    }  
}
