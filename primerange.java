import java.util.*;
public class primerange
{
    public static void main(String args[])
    {   int flag=0;
        Scanner in=new Scanner(System.in);
        int r1=in.nextInt();
        int r2=in.nextInt();
        for(int i = r1; i <= r2; i++)
         {
             for(int j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
        }
    }
}
