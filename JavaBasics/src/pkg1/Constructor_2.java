package pkg1;

public class Constructor_2 {

	Constructor_2() // constructor Overloading -non parameterized
	{
		System.out.println("this is non parameterized  constructor");
	}
	
	Constructor_2(int a)//parameterized constructor
	{
		System.out.println("this is parameterized constructor");
	}
	public static void main(String[] args) {
new Constructor_2();
new Constructor_2(1);
new Constructor_1();
	}

}
