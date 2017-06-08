import java.io*;
import java.util.*;
public class power
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int p=1;
int pow=in.nextInt();
for(int i=1;i<pow;i++)
{
 int p=p*n;
}
System.out.println(p);
}
}
