
package pkg5;

import java.util.Scanner;

public class Ass_11 {

static int num;
	public static void main(String[] args) {
Scanner s1 = new Scanner(System.in);
System.out.println("enter your number1");
int num1 = s1.nextInt();
System.out.println("enter your number2");
int num2=s1.nextInt();
int greater =(num1>num2)?num1:num2;
System.out.println(greater);
System.out.println((greater%2==0)?"even":"odd");
	}
	
}



//package pkg5;

//
//import java.util.Scanner;
//
//public class Ass_11 {
//
//	public static void main(String[] args) {
//Scanner s1 = new Scanner(System.in);
//System.out.println("enter your number1");
//int num1 = s1.nextInt();
//System.out.println("enter your number2");
//int num2=s1.nextInt();
//if(num1>num2 )
//{
//	if(num1 % 2 == 0) {
//		System.out.println("number1 is even");	
//	}else {
//		System.out.println("number1 is odd");
//	}
//	System.out.println("number1 is greater");
//}else 
//{
//	if(num2 % 2 == 0) {
//		System.out.println("number2 is even");	
//	}else {
//		System.out.println("number2 is odd");
//	}
//	System.out.println("number2 is greater");	
//}
//	}
//}

//else
//{
//	System.out.println("number1 is odd");
//}
//else
//{
//	System.out.println("num2 is greater");	
//}
//if(num2%2==0)
//{
//	System.out.println("number 2  even");
//}
//else
//{
//	System.out.println("number 2 is odd ");
//}
//	
//
//}
//}
