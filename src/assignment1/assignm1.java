package assignment1;

import java.util.Scanner;

public class assignm1 {

	public static void main(String[] args) {
		// Write a program to print hello and name in a separate line
		System.out.print("hello");
		System.out.println("Pavithra");
		
		//write a program to print sum of 2 numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		System.out.println("sum = "+sum);
		
		//write a program to swap 2 numbers
		int a=10;
		int b= 20;
		int temp;
		System.out.println("Before swap "+ "a= "+ a + " b= "+ b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("After swap "+ "a= "+ a + " b= "+ b);
		
		

	}

}
