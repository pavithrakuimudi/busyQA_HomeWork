package assignment5;

public class CustomExceptionImpl {

	//demo of custom Exception 
	public static void demoCustomExceptionUsuage(int num) throws customException {
		if(num<0) {
			throw new customException("Number entered is below 0");
		}else {
			System.out.println("Entered number is valid");
		}
	}
	
	//Testing the custom exception
	public static void main(String[] args) {
		
		try {
			demoCustomExceptionUsuage(-1);
		} catch (customException e) {
			System.out.println("Exception caught: "+ e.getMessage());
		}
	}

}
