package assignment5;

import java.util.Scanner;

//created a custom exception class
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		//Exception class accepts String message. Here using super keyword we are assigning it to the parent Exception constructor
		super(message); 

	}
}

// demonstration of usage of custom exception class using a new class 
public class UserDefinedException {

	public static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or older to drive a car.");
		} else {
			System.out.println("Age is valid to Drive a car.");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age: ");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch(InvalidAgeException e) {
			System.out.println("Exception caugth: "+ e.getMessage());
		}
		sc.close();
	}


}
