import java.util.*;
public class digit
{
    public static void main(String args[])
    { 
        int t=0;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
      while(n>0)
      {
          t=n%10;
          n=n/10;
          System.out.print(t);
      }
    
    }
}
