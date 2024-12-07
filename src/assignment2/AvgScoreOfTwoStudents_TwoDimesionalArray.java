package assignment2;

public class AvgScoreOfTwoStudents_TwoDimesionalArray {

	public static void main(String[] args) {
		// Write a Java program to find the average score of two students in three papers using 2-dimensional
		//array.​

		int[][] array = {{8,7,9},{7,8,9}};
		int sum = 0, count = 0;
		for(int i=0; i<array.length;i++) {
			for (int j=0; j<array[i].length; j++) {
				sum+=array[i][j]; //adding every element in the array
				count++;  // to find the total element in the array
			}
		}
		int avg = sum/count;
		System.out.println("Average score of 2 students in 3 papers = "+ avg);


}
}
