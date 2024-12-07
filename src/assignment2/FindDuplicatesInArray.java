package assignment2;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		//Write a program to find duplicate elements in an array.​
		int[] array = {1,2,3,3,8,14,14};

		for(int i=0; i<array.length; i++) {

			for(int j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]+" is a duplicate element in the array");
					break;
				}
			}//end of inner for loop

		}//end of outer for each loop
	}

}
