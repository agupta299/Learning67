package pkg1;

public class Method_Overloading1 {
static void add(int a,int b)
{ int c = a+b;
System.out.println(c);
	}
static void add(int a,double b)
{
	double c =a +b;
	System.out.println(c);
	}
static void add(double a,double b)
{
	double c =a +b;
	System.out.println(c);
	}
static void add(double a,int b)
{
	double c =a +b;
	System.out.println(c);
	}

	public static void main(String[] args) {
		
add(12,12);
add(1.1,90);
add(1.1,1.1);
add(90,1.1);
	}

}
