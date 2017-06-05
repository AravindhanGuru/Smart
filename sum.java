import java.util.*;
import java.io.*;


class Number
{
	public static void main (String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n>0)
	{
		System.out.println("The given number is positive");
	}
	else if(n<0)
	{
		System.out.println("The given number is negative");
	}
	else
	{
		System.out.println("The number is zero");
	}
		
	}
}
