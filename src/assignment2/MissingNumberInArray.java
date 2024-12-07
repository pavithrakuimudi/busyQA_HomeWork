package assignment2;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {


		int[] array1 = {1,2,3,3,8,14};

		int[] array2 = {1,2,3,3,8,9,14};

		Arrays.sort(array1);
		Arrays.sort(array2);

		int num = 0;
		if(array1.length>array2.length) {
			for(int i=0; i<array2.length; i++) {
				if(array1[i]!=array2[i]) {	
					num= array1[i];
					System.out.println(num + " is the missing number in array2");
					break;
				}
			}
			if(array1[array1.length-2]==array2[array2.length-1]) {
				System.out.println(array1[array1.length-1]+ " is the missing number in array2");
			}

		}else {
			for(int i=0; i<array1.length; i++) {
				if(array2[i]!=array1[i]) {	
					num= array2[i];
					System.out.println(num + " is the missing number in array1");
					break;
				}
			}
			if(array2[array2.length-2]==array1[array1.length-1]) {
				System.out.println(array2[array2.length-1]+ " is the missing number in array1");
			}
		}


	}
}
