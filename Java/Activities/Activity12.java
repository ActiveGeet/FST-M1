package activities;

public class Activity12 {

	public static void main(String[] args) {

		
		Addable ad1 = (num1,num2) -> (num1+num2);
		System.out.println("Addition of two numbers: "+ad1.add(5, 6));
		
		Addable ad2 = (int num1,int num2)->{
			return (num1+num2); 
		}; 
		System.out.println("Sum of two numbers: "+ad2.add(30, 20));
	}

}
