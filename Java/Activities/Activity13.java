package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {

		System.out.println("Enter numbers: ");
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
        Random key = new Random();
        
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        
        Integer nums[] = list.toArray(new Integer[0]);
        int index = key.nextInt(nums.length);
        System.out.println("Index value : " + index);
        System.out.println("Value in arary at index: " + nums[index]);
 
        scan.close();
 
	}

}
