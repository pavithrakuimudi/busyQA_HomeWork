package assignment4;

public class Calculation implements A, C {

	public static void main(String[] args) {
		Calculation o1 = new Calculation();
		
		System.out.println("sum = "+o1.sum());
		System.out.println("product = "+o1.mul());

	}

	@Override
	public int mul() {
		int mul = x*y;
		return mul;
	}

	@Override
	public int sum() {
		int sum = a+b;
		return sum;
	}

}
