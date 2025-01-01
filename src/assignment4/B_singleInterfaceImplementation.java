package assignment4;

public class B_singleInterfaceImplementation implements A {

	public static void main(String[] args) {
		B_singleInterfaceImplementation o1= new B_singleInterfaceImplementation();
		
		System.out.println("sum of variables from interface is "+o1.sum());
	}
	
	@Override
	public int sum() { //implementing sum() from Interface A
		int sum = a+b;
		return sum;
	}

}
