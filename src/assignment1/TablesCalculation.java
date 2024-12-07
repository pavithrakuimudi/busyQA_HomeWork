package assignment1;

import java.util.Scanner;

public class TablesCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java to display the multiplication table of a given integer using for loop.​

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i =0;
		while( i++ <10) { //displays initial value and then increments
			int res = num * i;
			System.out.println(num + " X "+ i + " =" + res);
		}
		sc.close();
	}

}
