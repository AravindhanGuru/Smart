import java.util.*;
public class conv
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char[] ch=s.toCharArray();
        byte n[]=new byte[ch.length];
        for(int i=0;i<ch.length;i++)
        {
        n[i]=(byte)ch[i];
        System.out.print(n[i]);
        }
    }
}
