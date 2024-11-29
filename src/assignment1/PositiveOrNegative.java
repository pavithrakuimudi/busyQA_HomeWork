package assignment1;


import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// Get a number from user and print if it is positive or negative
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
	
		if(num >= 0) {
			System.out.println(num + " is positive");
		}else {
			System.out.println(num + " is negative");
		}

	
		
	
	
	}
}
