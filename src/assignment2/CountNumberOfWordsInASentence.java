package assignment2;

public class CountNumberOfWordsInASentence {

	public static void main(String[] args) {
		// Write a Java program to count number of words in a sentence.​
		String sent = "    This is my name.";
		
		sent = sent.trim();
		String[] sentString = sent.split(" ");
		System.out.println("Number of words in a sentence= "+ sentString.length);

		
	}

}
