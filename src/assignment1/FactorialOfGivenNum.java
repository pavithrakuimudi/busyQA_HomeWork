package assignment1;

import java.util.Scanner;

public class FactorialOfGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a Java Program to print factorial of a given number using any loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int factorialProduct = 1;
		for(int i=1; i<=num; i++) {
			factorialProduct = i*factorialProduct;
			
			}
		System.out.println(factorialProduct);
		}
		
	}


