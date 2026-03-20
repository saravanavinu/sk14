import java.util.Scanner;
class DoubleInt
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		DoubleInt p=new DoubleInt();
		p.menu();
	}
	void menu()
	{
		System.out.print("Enter a value in Double :");
		double value=sc.nextDouble();
		int b=operation(value);
		System.out.println("Integer value for respected Double :"+b);
	}
	int operation(double d)
	{
		int b=(int)d;
		return b;
	}
}