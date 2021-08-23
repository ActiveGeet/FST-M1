package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberArray = {10, 77, 10, 54, -11, 10};
		System.out.println("Number Array: " +numberArray);
		int i=0;
		int Sum = 0;
		boolean res = false;
		for(i=0; i<numberArray.length;i++) {
			System.out.println("Number Available at "+i+" position: "+numberArray[i]);
			if(numberArray[i]==10) {
				Sum = Sum+numberArray[i];
			}
		}
		
		res = result(Sum);
		System.out.println("Condition Satisfied? "+res);
	}
	
	public static boolean result(int Sum) {
		if(Sum==30) {
			System.out.println("Sum of all the 10's in the array is exactly 30");
			return true;
		}
		else{
			System.out.println("Sum of all the 10's in the array is not 30");	
			return false;
		}
	}
}
