import java.util.Scanner;
import java.security.*;
public class weird
{
   private static final Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {      
        int n = sc.nextInt();
        if((n>=1) && n<=100)
        {
            if(n%2==0)
            {
                if((n>=2) && n<=5)
                System.out.println("Not Weird");
                else if((n>=6) && (n<=20))
                System.out.println("Weird");
                else if(n<=20)
                System.out.println("Not weird");
                else
                System.out.println("Not Weird");
            }
            else
            System.out.println("Weird");
        }
        else
        System.out.println("Enter a value between 1 and 100");
        sc.close();
    }
}