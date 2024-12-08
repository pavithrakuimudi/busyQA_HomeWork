package assignment3;

public class Calculation {

	//write a program to demonstrate constructor
	int a , b, c;

	Calculation(){

	}// created this default constructor to create obj of this class without passing any variables

	Calculation(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void sum() {
		int sum = a+b+c;
		System.out.println("Sum of three integers = "+ sum);
	}

	int sum(int x, int y) {
		int sum = x+y;
		return sum;

	}
	int sum(int x, int y, int z) {
		int sum = x+y+z;
		return sum;
	}

	double sum(double x, double y) {
		double sum = x+y;
		return sum;

	}

	double sum(double x, double y, double z) {
		double sum = x+y+z;
		return sum;

	}

}
