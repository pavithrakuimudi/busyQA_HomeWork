package assignment1;

import java.util.Scanner;

public class ReverseANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to reverse a number using while loop.​
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0 ;
		while(num>0) {
			 rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		sc.close();
	}

}
