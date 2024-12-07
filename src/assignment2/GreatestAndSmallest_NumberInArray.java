package assignment2;

public class GreatestAndSmallest_NumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,3,8,9,14};
		//Write a program to find greatest and smallest element in an array.
				int greatestNum = array[0];
				int smallestNum = array[0];
				for(int i:array) {
					 
					if(i>greatestNum) {
						greatestNum = i;
					}	
					if(i<smallestNum) {
						smallestNum = i;
					}
				}
				System.out.println("Greatest number in the array = "+ greatestNum );
				System.out.println("Smallest number in the array = "+ smallestNum );
				
	}

}
