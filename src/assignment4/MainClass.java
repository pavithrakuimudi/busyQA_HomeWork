package assignment4;

public class MainClass {

	public static void main(String[] args) {
		ComputerTeacher o1 = new ComputerTeacher();
		
		System.out.println(o1.collegeName);
		System.out.println(o1.designation);
		
		o1.does(); // I am able to access the method from parent class-Teacher
	
		
	}
}
