package assignment2;

public class SumOfValues_Avarage {

	public static void main(String[] args) {

		//Write a Java program to calculate sum values of an array.​
		int[] array = {1,2,3,3,8,9,14};
		float sum=0;
		for(int i =0; i<array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("sum of array = "+ sum);

		//Write a Java program to calculate average of values of an array.​

		float avg = sum/array.length;
		System.out.println("Average of vlaues of an array = "+ avg);

	}}
