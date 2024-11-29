package assignment1;

import java.util.Scanner;

public class VerifyLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that takes a year from user and print whether that year is a leap year or not.​
		
		Scanner sc= new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0 && year%100 !=0)|| year%400 ==0) {
			System.out.println(year + ": Year is a leap year. ");
				}else {
					System.out.println(year + ": Year is not a leap year. ");
				}
	}

}
