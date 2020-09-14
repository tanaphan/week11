package week11;

public class constructor1 {
	//Constructor
	int age=5;
	String size;
	String breed="Persian";
	
	public constructor1() {
		System.out.println("My Cat is age ="+age);
		System.out.println("My Cat is breed ="+breed);
	}
	void method1() {
		System.out.println("My Cat is size ="+size);
	}
	void method2() {
		
	}
	public static void main(String[]args) {
		String size="Big";
		constructor1 cat1 = new constructor1();
		constructor1 cat2 = new constructor1();
		cat2.size="small";
		cat2.method1();
	}
}
