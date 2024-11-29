package assignment1;

import java.util.Scanner;

public class CountNumOfDigitsInANumber {

	public static void main(String[] args) {
		//Write a Java program count the number of digits of the number using while loop.​
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum = sum+ num%10;
			num = num/10;
		}
		System.out.println("sum of all the digits =" + sum );
	}
}
