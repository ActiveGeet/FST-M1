package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();
		myList.add("ARNAB");
		myList.add("BHAVYA");
		myList.add("CHINU");
		myList.add("DIYA");
		myList.add("KIARA");
		
		System.out.println("Printing array names: ");
		
		for(String name:myList) {
			System.out.println(name);
		}
		
		System.out.println("Retrieve the 3rd name in the ArrayList: "+myList.get(2));
		
		System.out.println("Check if KANAK exists in the ArrayList: "+myList.contains("KANAK"));
		System.out.println("Check if DIYA exists in the ArrayList: "+myList.contains("DIYA"));
		
		System.out.println("Print the number of names available in the ArrayList: "+myList.size());
		
		System.out.println("Remove a name from the list "+myList.remove(0));
		
		System.out.println("Print the number of names available in the ArrayList after removing a name: "+myList.size());
	}

}
