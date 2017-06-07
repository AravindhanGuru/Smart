import java.util.Scanner;
public class alpha {

   
    public static void main(String[] args) {
       
        
    {
Scanner in=new Scanner(System.in);
String s1=in.nextLine();
char[] c=s1.toCharArray();
char j=s1.charAt(0);
int a=(int)(j);
if(a>=65 && a<=90 || a>=97 && a<=122)
{
System.out.println("Alphabet");
}
else
{
System.out.println("Not a alphabet");
}
}
    }
}
