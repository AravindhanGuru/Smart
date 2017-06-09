import java.io.*;
import java.util.*;
public class even
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
               System.out.println(i);
            }
           
        }
    }
}
