package activities;

public class Activity7 {

	public static void main(String[] args) {
		MountainBike mbike = new MountainBike(1, 20, 30);
        System.out.println(mbike.bicycleDesc());
        mbike.speedUp(40);
        mbike.applyBrake(3);
	}

}
