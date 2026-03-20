import java.util.Scanner;
class IntByte
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		IntByte w=new IntByte();
		w.menu();
	}
	void menu()
	{
		System.out.print("Enter the integer value :");
		int y=sc.nextInt();
		byte z=operation(y);
		System.out.println("Byte value for the respected integer value :"+z);
	}
	byte operation(int i)
	{
		byte b=(byte)i;
		return b;
	}
}