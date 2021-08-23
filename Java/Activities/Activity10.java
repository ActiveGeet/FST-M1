package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("RED");
		hs.add("YELLOW");
		hs.add("GREEN");
		hs.add("BLUE");
		hs.add("PINK");
		hs.add("ORANGE");
		
		System.out.println("Print Hash Set: ");
		for(String obj:hs) {
			System.out.println(obj);
		}
		
		System.out.println("Size of HashSet: "+hs.size());
		
		System.out.println("Remove an Object 'BLUE' from HashSet "+hs.remove("BLUE"));
		
		System.out.println("Remove an element that is not present in the Set."+hs.remove("WHITE"));
		
		System.out.println("Check if 'BLACK' is in the Set or not "+hs.contains("BLACK"));
		System.out.println("Check if 'YELLOW' is in the Set or not "+hs.contains("YELLOW"));
		
		System.out.println("Print Updated Hash Set Size: "+hs.size());
		System.out.println("Print Updated Hash Set: ");
		for(String obj:hs) {
			System.out.println(obj);
		}
		
	}

}
