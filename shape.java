package ojas2;
import java.util.Scanner;
class shape
{
	int l,b,area;
	shape(int m)
	{
		l=m;
		area=l*l;
	}
	shape(int x,int y)
	{
		l=x;
		b=y;
		area=l*b;
	}
	void display()
	{
		System.out.println("Area = "+area);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:");
		int s;
		s=sc.nextInt();
		shape s1=new shape(s);
		s1.display();
		System.out.println("Enter the side of the rectangle:");
		int l,b;
		l=sc.nextInt();
		b=sc.nextInt();
		shape s2=new shape(l,b);
		s2.display();
	}
}
