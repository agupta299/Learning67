package pkg5;

import java.util.Scanner;

public class Ass_10 {

	public static void main(String[] args) {
Scanner s1= new Scanner(System.in);
System.out.println("Enter your number");
int a = s1.nextInt();
if(a>=1 && a<=10)
{
	System.out.println("Number is between 1-10");
}
else if(a>=11 && a<20)
{
	System.out.println("Number is between 11-20");
}
else if(a>=20)
{
	System.out.println("number is 20 or above");
}
else
{
	System.out.println("number didnot match any of the condition");
}
	}

}
