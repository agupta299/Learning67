package pkg1;

public class Non_static_MethodCall {
	
		 void add(int a,int b)
		{ int c = a+b;
		System.out.println(c);
			}
		void add(int a,double b)
		{
			double c =a +b;
			System.out.println(c);
			}
		 void add(double a,double b)
		{
			double c =a +b;
			System.out.println(c);
			}
		 void add(double a,int b)
		{
			double c =a +b;
			System.out.println(c);
			}

			public static void main(String[] args) {
				Non_static_MethodCall MO=new Non_static_MethodCall();	
	MO.add(12,12);
	MO.add(1.1,90);
	MO.add(1.1,1.1);
	MO.add(90,1.1);
			}

		


	}

