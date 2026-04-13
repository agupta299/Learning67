package pkg5;

public class Ass_20 {

	void Login(String email)
	{
		if(email.endsWith("gmail.com"))
		
		System.out.println("Loin with gmail");
	}
	void Login(String email,String password)
	{
		if (email.endsWith("gmail.com") && password.length()>6)
		{
		System.out.println("Login with gmail and password");
		}
	}
	void Login(String email, String password, String OTP)
	{
		if(email.endsWith("gmail.com") && password.length()>6 && OTP.length()>4)
		{
		System.out.println("Login with gmail,password and OTP");
	}
	}
	public static void main(String[] args) {
		Ass_20 Str=new Ass_20();
		Str.Login("apurva9110@gmail.com");
		Str.Login("apurva9110@gmail.com", "1213221");
		Str.Login("apurva9110@gmail.com", "1213484","132334");
		
	}

}
