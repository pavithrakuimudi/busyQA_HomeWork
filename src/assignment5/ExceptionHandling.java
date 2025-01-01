package assignment5;

public class ExceptionHandling {

	public static void main(String[] args) {
		//write a program to show below exception handling 
		// Any number divide by zero
		try {
			int num= 100/0;
			System.out.println(num);
		}catch(Exception ex){
			System.out.println("Exception caught: "+ ex.getMessage());

		} finally {
			System.out.println("I am at finally block");
		}

		//int a[] =null; a.length
		try {
			int a[] = null;
			System.out.println(a.length);	

		}catch(Exception ex){
			System.out.println("Exception caught: "+ ex.getMessage());
		} finally {
			System.out.println("I am at finally block");
		}

		//array index out of bound example
		try {	
			//	System.exit(0); //this will make program execution to exit right here. Hence finally block will not get executed
			int b[] = {2,4};
			System.out.println(b[3]);

		}catch(Exception ex){
			System.out.println("Exception caught: "+ ex.getMessage());
		} 

		finally {
			System.out.println("I am at finally block");
		}
	}

}
