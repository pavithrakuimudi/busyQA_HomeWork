package assignment2;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		//Write a Java program to reverse a string.​
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String name = sc.next();
		
		//using StringBuilder method
		StringBuilder sb = new StringBuilder(name);
		System.out.println("Using string builder :"+sb.reverse());

		//using loop
		String rev= "";
		for(int i=name.length()-1; i>=0; i--) {
			rev= rev+name.charAt(i);
		}
		System.out.println("Reversing the text using for loop: "+ rev);
		
		sc.close();
		}
}
