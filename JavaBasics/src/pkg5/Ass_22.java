package pkg5;

import java.util.Scanner;

public class Ass_22 {

	public static void main(String[] args) {
Scanner s1 = new Scanner(System.in);
System.out.println("enter  number");
int Marks = s1.nextInt();
		switch (Marks)
		{
		case 76: 
			if(Marks>=75)
			{
			System.out.println("Distinction pass");
			}
			else if (Marks>=60)
			{
				System.out.println("First Class pass ");
			}
			else
			{
				System.out.println("Second Class pass");
			}
			break;
		
		default : 
			if(Marks<35)
			System.out.println("Fail");
		}
	}

}
