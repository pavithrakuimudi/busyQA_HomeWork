package assignment2;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// Write a program to check a string is palindrome or not​ (e.g., reverse of "level" is "level")
		System.out.println("Enter a text");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		String rev= "";

		for(int i =name.length()-1; i>=0; i--) {
			rev= rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equals(rev)) {
			System.out.println("Entered text  '"+name+ "' is a palindrome");
		}else {
			System.out.println("Entered text '"+name+ "' is not a palindrome");
		}

		sc.close();
	}

}
