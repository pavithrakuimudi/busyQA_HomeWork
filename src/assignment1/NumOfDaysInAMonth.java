package assignment1;

import java.util.Scanner;

public class NumOfDaysInAMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// number of days in a month using switch statement
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1-12 to represent a month: ");
		int month = sc.nextInt();
	int days;
		switch (month) {
		case 1: 
		case 3:
		case 5: 
		case 7:
		case 8: 
		case 10:
		case 12:
			days =31;
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			days =30;
			break;
		case 2:
			days=29;
			break;
		default:
			System.out.println("Invalid month entered.");
	        return;
		}
		System.out.println("Number of days: "+ days);
	}

}
