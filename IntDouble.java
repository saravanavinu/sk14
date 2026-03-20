import java.util.Scanner;
class IntDouble
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		IntDouble c=new IntDouble();
		c.read();
	}
	void read()
	{
		System.out.print("Enter any integer value :");
		int first=sc.nextInt();
		double second=typecast(first);
		System.out.print("Double value for respected integer value :"+second);
	}
	double typecast(int a)
	{ 
		double d=a;
		return d;
	}
}