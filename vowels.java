import java.util.*;
public class vowels {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String s=in.nextLine();
       int s1=0,s2=0;
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
           {
               s1++;
           }
           else
               s2++;
       }
        System.out.println("Vowels"+s1+"Constants "+s2);
    }
    
}
