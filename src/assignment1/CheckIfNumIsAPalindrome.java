package assignment1;

import java.util.Scanner;

public class CheckIfNumIsAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to check Number is Palindrome or not using while loop.​ (Reverse of 121 is 121,
		//so it is palindrome)

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int Enternum = sc.nextInt();
		int num = Enternum;
		int rev = 0;
		while(num>0) {
			rev = rev*10+num%10; //logic to reverse a number
			num= num/10;         // digits in the number is reduced by dividing it by 10
			
		}
		
		if(rev== Enternum) {
			System.out.println("number is a palindrome");	
		}else {
			System.out.println("number is not a palindrome");
		}
		
	}

}
