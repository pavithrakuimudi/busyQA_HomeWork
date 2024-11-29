package assignment1;

import java.util.Scanner;

public class FindGreatestOf3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the greatest of 3 numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number num 1 = ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number num 2 = ");
		int num2 = sc.nextInt();
		System.out.print("Enter third number num 3 = ");
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("The greatest 3 numbers is= "+ num1 );
		}else if(num2> num1 && num2> num3) {
			System.out.println("The greatest 3 numbers is= "+ num2 );
		} else {
			System.out.println("The greatest 3 numbers is= "+ num3 );
		}
		
		
//		//find greatest in an array
//	int[] numb = {11,6,8};
//	int temp = numb[0];
//	for(int i=0; i<numb.length; i++) {
//		if (numb[i]>temp) {
//			temp= numb[i];
//		}	
//	}
//	System.out.println("the greatest number is "+ temp);

	}

}
