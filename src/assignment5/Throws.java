package assignment5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws InterruptedException, IOException {
		Throws o1 = new Throws();
		o1.checkedExceptionThrows();
		
		//UserDefinedException.validateAge(13); // user defined exception-InvalidAgeException
		
	}
	void checkedExceptionThrows() throws InterruptedException, IOException {
		System.out.println("Checking throws execption");
		Thread.sleep(2000);
		
		FileReader fr = new FileReader("C://workspace");
		BufferedReader bf = new BufferedReader(fr);
		System.out.println(bf.readLine());
	}
}
