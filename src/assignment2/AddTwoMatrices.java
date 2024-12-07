package assignment2;

public class AddTwoMatrices {

	public static void main(String[] args) {
		// write a program to add 2 matrices in 2 dimensional array
		
				int[][] array1 = {{1,2,3},{3,4,0}};
				int[][] array2 = {{2,3,0},{5,6,1}};
				
				System.out.println("Values inside the newArray = ");
				for(int i=0; i<array1.length;i++) {  //rows
					
					//created third array to store the sum of 2 matrices
					int[][] newArrray = new int[array1.length][array1[i].length]; 
					
					for (int j=0; j<array1[i].length; j++) {  //columns
						newArrray[i][j] =  array1[i][j] +  array2[i][j];
						System.out.print( newArrray[i][j]+ "  ");
			}
					System.out.println(); // added this to move the print statement to 2nd line
				}

	}

}
