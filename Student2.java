package week11;

public class Student2 {
	//state
	int Number1;
	int Number2;
	String Name;
	//constructor
	public Student2() {
		super();
		System.out.println("We are Constructor");
	}
	//Parameter Constructor
	public Student2(int num1, int num2, String name){
		this.Number1=num1;
		this.Number2=num2;
		this.Name = name;
		
	}
	public static void main(String[]args) {
		Student2 std1 = new Student2(20,50,"Mark Suckaberg");
		Student2 std2 = new Student2();
		
		System.out.println("Default value of Number1 is " + std1.Number1);
		System.out.println("Default value of Number2 is " + std1.Number2);
		System.out.println("Default value of Name is " + std1.Name);
	}
}
