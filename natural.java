import java.io*;
import java.util.*;
public class natural
{
public static void main(String args[])
{
int a, n, sum = 0;
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for (a = 1; a <= n; a++)
{
sum = sum + a;
}
System.out.println("the sum of natural numbers is "+sum);

}
}
