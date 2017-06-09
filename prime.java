import java.io.*;
import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int flag=0;
       int count=0;
        int temp=n;
        for(int i=temp;i>0;i--)
        {
            
            
            if((n%i)==0)
            {
                
                count++;
            }
            }
            if(count==2)
            {
                System.out.println("Prime number");
                flag=1;
            }
            else
            {
                System.out.println("Not a Prime number");
            }
            
        
        
    }
}
