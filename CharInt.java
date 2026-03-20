import java.util.Scanner;
class CharInt
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		CharInt h=new CharInt();
		h.menu();
	}
	void menu()
	{
		System.out.print("Enter any character :");
		char c=sc.next().charAt(0);
		int a=operation(c);
		System.out.println("Integer value for respected character :"+a);
	}
	int operation(char c)
	{
		int b=c;
		return b;
	}
}