package pkg1;

public class Method_Overloading {
	
	static void login(long Mobileno)
	{
		System.out.println("Login using number");
	}
	static void login(String emailid)
	{
		System.out.println("login using email");
	}
	public static void main(String[] args) {
	
login("apurva9110@gmail.com");
login(989173484);

	}


}

