package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {

		HashMap<Integer, String> colours = new HashMap<Integer, String>();
		colours.put(1, "RED");
		colours.put(2, "YELLOW");
		colours.put(3, "GREEN");
		colours.put(4, "BLUE");
		colours.put(5, "PINK");
		
		System.out.println("Size of HashMap: "+colours.size());
		
		System.out.println("Print HashMap: "+colours);
		
		System.out.println("Remove one colour "+colours.remove(2));
		
		System.out.println("Check if the colour GREEN exists in the Map: "+colours.containsValue("GREEN"));
		
		System.out.println("Updated Size of HashMap: "+colours.size());
		
		System.out.println("Print Updated HashMap: "+colours);
	}

}
