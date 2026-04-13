package pkg1;

public class Constructor_1 {

	Constructor_1()   // this is constructor-default,non static,non parameterized,no return type
	
	{
		System.out.println("this is my constructor"); 
	}
	
	static void add()  //static method
	{
		System.out.println("this is my static method"); 
	}
	
	void sub()  // non static method
	{
		System.out.println("this is my non static method"); 
	}
	
	public static void main(String[] args) //main method
	
	{
		Constructor_1 c = new Constructor_1(); // creating object and invoking constructor automatically
		add();
		c.sub();
		//new Constructor_1() //another way of creating an object.
	
	
	}

}
