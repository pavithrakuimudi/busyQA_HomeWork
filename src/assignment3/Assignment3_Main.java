package assignment3;

public class Assignment3_Main {

	public static void main(String[] args) {

		//Write a program to demonstrate constructor
		Calculation cal1 = new Calculation(9, 9, 9);
		cal1.sum();

		//Classes part2
		System.out.println( "\nMethod Overloading");
		Calculation cal = new Calculation();
		int sumOf2Int =cal.sum(9, 10);
		System.out.println("Sum of 2 integers = "+ sumOf2Int);
		int sumOf3Int =cal.sum(9, 10, 10);
		System.out.println("Sum of 3 integers = "+ sumOf3Int);
		double sumOf2Double = cal.sum(8.8, 9.9);
		System.out.println("Sum of 2 double = "+ sumOf2Double);
		double sumOf3Double = cal.sum(8.8, 9.9,7.7);
		System.out.println("Sum of 3 double = "+ sumOf3Double);
	}

}
