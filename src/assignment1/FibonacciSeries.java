package assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print Fibonacci Series in the range of 1 to 50. Series:(1, 1, 2, 3, 5, 8, 13...).

		int sum = 0;
		int num1= 0;
		int num2 =1;
		while(num2<=50){
			System.out.print(num2 + " ");
			sum = num1 +num2;
			num1=num2;
			num2= sum;
		}


	}

}
