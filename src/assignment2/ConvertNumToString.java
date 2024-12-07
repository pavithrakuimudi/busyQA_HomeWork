package assignment2;

public class ConvertNumToString {

	public static void main(String[] args) {
		// Write a Java program to convert integer to string.​
		
		
		int num = 8;
		
		String number = Integer.toString(num);	//String.valueOf(num);
		System.out.println("String value of num = "+ number);

		//Write a Java program to convert string to integer.​
		
		String numString = "9";
		int numInt = Integer.parseInt(numString);
		System.out.println("Integer valuse of String: " + numInt);
		
		//Write a Java program to remove white spaces in a string.​
		String name= "This is my name";
		name= name.trim();
		name = name.replace(" ", "");
		System.out.println("After removing white spaces: "+ name);
		
	}

}
