package pkg5;

public class Ass_23 {
	

	static void AddToCart(int a,int b)
	{
	System.out.println("I am Overloading Method1");

		}
	
	static void AddToCart(int a,double b)
	{
		System.out.println("I am Overloading Method2");
		
	}
	
	Ass_23()
	{
		System.out.println("I am Overloading constructor1");
	}
	
	Ass_23(int a)
	{
		System.out.println("I am Overloading constructor2");
	}
	
	void Checkout(int a,int b)
	{
		System.out.println("Non static method1");
	}
	
	void Checkout(double a,int b)
	{
		System.out.println("Non static method2");
	}
	
	public static void main(String[] args) {
		
		AddToCart(1,2);
		AddToCart(1,2.9);
	new	Ass_23(1);
	Ass_23 MO =new	Ass_23();
	MO.Checkout(1,2);
	MO.Checkout(1.9,2);
	
}
}
