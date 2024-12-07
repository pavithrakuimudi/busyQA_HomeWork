package assignment2;

public class OddEvenInArray {

	public static void main(String[] args) {

		//Write a Java program to print even and odd numbers in an array.
		int[] array = {1,2,3,3,8,9,14};

		for(int i = 0; i< array.length;i++) {
			if(array[i]%2 >0) {
				System.out.println(array[i] + " is a odd number");
			} else {
				System.out.println(array[i] + " is a even number");
			}
		}
	}

}
