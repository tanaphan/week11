package week11;

public class Cat {
	//instance variable,date,state,attribute,property,props
	String breed="aa";
	String size;
	String color;
	String name;
	int age;
	//Method = behavior of an object
	void print() {
		System.out.println("Breed is: "+breed);
		System.out.println("Size is: "+size);
	}
	void name() {
		System.out.println("Name is :"+name);
	}
	
	public static void main(String[]args) {
		Cat Cat1 = new Cat();//Object Cat1
		Cat Cat2 = new Cat();//Object Cat2
		Cat1.breed="Persian";
		Cat1.size="Big";
		Cat1.color="Whitblack";
		Cat1.age=5;
		Cat1.print();
		Cat1.name="juy";
		Cat1.name();
		Cat2.breed="Scottish Flod";
		Cat2.size="Small";
		Cat2.print();
	}
}
