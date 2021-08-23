package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Plane plane = new Plane(5);
		plane.onboard("ARNAB");
		plane.onboard("BHAVYA");
		plane.onboard("CHETAN");
		/*
		 * plane.onboard("DIYA"); plane.onboard("KIARA");
		 */
		
		System.out.println("Plane TookOff at : "+plane.takeOff());
		
		System.out.println("Passengers available while tookoff on Plane : "+plane.getPassengers());
		Thread.sleep(5000);
		
		plane.land();
		
		System.out.println("Plane Landed at : "+plane.getLastTimeLanded());
		
		System.out.println("Passengers available while Plane Landing: "+plane.getPassengers());
		Thread.sleep(5000);
	}

}
