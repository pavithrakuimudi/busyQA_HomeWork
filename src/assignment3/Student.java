package assignment3;

public class Student {
	int SID; 
	String Sname;
	double Sub1, Sub2, Sub3;

	void getStuData(int SID, String Sname) {
		this.SID = SID;
		this.Sname = Sname;
	}

	void getStuMarks(double Sub1, double Sub2, double Sub3) {
		this.Sub1 = Sub1;
		this.Sub2 = Sub2;
		this.Sub3 = Sub3;
	}

	void totalMarks() {
		double totalmarks = Sub1+Sub2+Sub3 ; 
		System.out.println(Sname+ " - " + SID);
		System.out.println("Total marks of "+ Sname+ " = "+totalmarks);

	}

	public static void main(String[] args) {
		// Main method is at the end

		Student stu1 = new Student();
		stu1.getStuData(123, "John");
		stu1.getStuMarks(7.8, 8.9, 9.9);
		stu1.totalMarks();

		Student stu2 = new Student();
		stu2.getStuData(124, "Alex");
		stu2.getStuMarks(8.8, 9.9, 7.9);
		stu2.totalMarks();
	}

}
