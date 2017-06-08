import java.io.*;
import java.util.*;
public class aount1
{
public static void main(String args[])
{
int count=0;
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a=String.valueOf(n).length();
for(int i=0;i<a;i++)
{
count++;
}
System.out.println(count);
}
}
