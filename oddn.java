import java.io.*;
import java.util.*;
public class oddn
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int last=in.nextInt();
        for(int i=n;i<last;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+":Even"+" ");
            }
            else
            {
                System.out.println(i+":Odd");
            }
        }
    }
}
