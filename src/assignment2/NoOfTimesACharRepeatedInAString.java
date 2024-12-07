package assignment2;

import java.util.ArrayList;
import java.util.List;

public class NoOfTimesACharRepeatedInAString {

	public static void main(String[] args) {
		//Write a Java program to count number of time a character repeated in a string.​

		String name = "testing test";
		name=name.replace(" ", "");
		System.out.println(name);
		char temp;
		int counter = 0;
		if(name.length()>0) {

			//find the distinct letters
			List<Character> distinct= new ArrayList<Character>();
			for(int i=0; i<name.length(); i++) {
				if(!distinct.contains(name.charAt(i))) {
					distinct.add(name.charAt(i));}
			}
			//loop through the distinct chars
			for(int i=0; i<distinct.size(); i++) {
				counter=0; //reset counter for every char
				temp = distinct.get(i);
				for(int j=0; j<name.length(); j++) { 
					if(temp==name.charAt(j)) {
						counter++;
					}
				}
				System.out.println(temp + " - "+ counter);
			}

		}
	}}


