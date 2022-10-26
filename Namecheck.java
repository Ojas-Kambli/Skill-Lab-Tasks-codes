package ojas;
import java.util.*;
class LongName extends Exception
{
	LongName(String s)
	{
			super(s);
	}
}
public class Namecheck 
{
	static void validate(String name, int length)throws LongName
	{
		if(length>10)
			throw new LongName("Name entered is too long");
		else
			System.out.println("Name :"+name);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name=sc.nextLine();
		int length=name.length();
		try
		{
			validate(name,length);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
		}
	}
}
