package activities;

import junit.extensions.ExceptionTestCase;

public class Activity8 {

	public static void main(String[] args) {
		Activity8 exception = new Activity8();
		try {
			exception.exceptionTest("Printing over Console");
			
			exception.exceptionTest(null);
			
			exception.exceptionTest("Will not execute");
		}
		catch(CustomException ce){
			System.out.println("In Catch Block "+ce);
		}
	}
	
	public void exceptionTest(String s) throws CustomException {
		if(s == null) {
			throw new CustomException("String Value is null");
		}
		else
		{
			System.out.println("String Value is "+s);
		}
	}

}
