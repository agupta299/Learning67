package pkg1;

public class Method_Constructor_Overloading {

	Method_Constructor_Overloading()
	{
		System.out.println("i am np constructor");
	}
	
	Method_Constructor_Overloading(int a)
	{
		System.out.println("i am p constructor");
	}
	
	Method_Constructor_Overloading(int a , int b)
	{
		System.out.println("i am double p constructor");
	}
	
	static void login (long mob)
	{
		System.out.println("i am login via mobile");
	}
	static void login (String email,char gender)
	{
		System.out.println("i am login via email and gender");
	}
	void logout11 ()
	{
		System.out.println("i am logout");
	}
	void logout11 (int a)
	{
		System.out.println("i am p logout");
	}
	
	public static void main(String[] args) {
		login(98989);
		login("ap",'F');
		Method_Constructor_Overloading MCO = new Method_Constructor_Overloading();
		new Method_Constructor_Overloading(1);
		new Method_Constructor_Overloading(2,3);
		MCO.logout11();
		MCO.logout11(2);
	}

}
