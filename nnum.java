import java.io.*;
import java.util.*;
public class nnum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int sum=0;
int n=in.nextInt();
for(int i=0;i<n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
