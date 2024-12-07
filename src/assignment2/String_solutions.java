package assignment2;

import java.util.Scanner;

public class String_solutions {

	public static void main(String[] args) {

		//Write a java program to compare two strings, ignoring case differences.​
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for String a: ");
		String a= sc.next();
		System.out.println("Enter a value for String b: ");
		String b = sc.next();
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Values of String a and b are same");
		}else {
			System.out.println("Values of String a and b are NOT same");
		}

		//Write a Java program to concatenate a given string to the end of another string. ​

		System.out.println("Value after concatinating a with b = "+a.concat(b));

		//Write a java program to get the length of a given string
		System.out.println("Length of String a = " + a.length());

		//Write a Java program to get a substring of a given string between two specified positions​
		String name = "John Doe";
		System.out.println("Substring from 2,8 of 'John Doe' is: "+name.substring(2, 8)); // hn Doe

		//Write a Java program to convert all the characters in a string to uppercase.​
		System.out.println("name in Uppercase = "+ name.toUpperCase()); //JOHN DOE
		
		//Write a Java program to convert all the characters in a string to lowercase.
		System.out.println("name in Lowercase = "+ name.toLowerCase()); //john doe
		
		sc.close();
	
}
}
